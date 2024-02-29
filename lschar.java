package gaya.base;

import java.util.Arrays;

public class lschar {
    public static void main(String[] args) {
        String name = "abi";
        char target = 'k';

        System.out.println(lss(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean lss(String name, char target) {
        if (name.length() == 0) {
            return false;
        }


       // for (int index = 0; index < name.length(); index++) {

        for (char ch:name.toCharArray()
             ) {
            if(ch==target) {
                return true;

            }
        }
            // String element=name[target];
        //    if (target == name.charAt(index)) {
            //    return true;


        return false;
    }
}




