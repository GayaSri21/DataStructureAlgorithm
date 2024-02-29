package gaya.ploymorphism;

import gaya.modi;
import org.w3c.dom.ls.LSOutput;

public class shapes {

    void area() {    ///method overriding coz all shape has same void area
        //every child(rectangle, circle...) uses their parent method
        System.out.println("circle, triangle, square, rectangle");
        System.out.println(in1.name);
    }

    public static void main(String[] args) {
        shapes shape1 = new rectangle();
        shapes shape2=new circle();
        shape2.area();
        System.out.println();
        shape1.area();
    }


    modi in1 = new modi(22,"abi");

    int n=in1.getNum();

}
