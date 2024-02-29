package gaya.base;

import java.util.Scanner;

public class leap {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("year:");
        long year=sc.nextLong();

        if(year % 4==0)
        {
            System.out.println("it is leap year");
        }
        else if(year%100==0)
        {
            System.out.println("its ");
        }
        else if(year%400==0)
        {
            System.out.println("it is");
        }
        else {
            System.out.println("not");
        }
    }
}
