package gaya.cloning;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {


        human gaya = new human("gaya", 13);
        //clone twin=new clone(gaya); //creating exact copy of the object. clone is method in the object class
       human twin = (human)gaya.clone();

        human tween=(human)gaya.clone();

        System.out.println(twin.name +" "+twin.age); //clone is actually copy everything from one object from another. //easy way to copy
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        tween.arr[3]=44;
        System.out.println(Arrays.toString(gaya.arr));
        System.out.println(Arrays.toString((twin.arr)));
       System.out.println(Arrays.toString(tween.arr));
    }
}
