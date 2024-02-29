package gaya;

import java.time.LocalDate;
import java.util.Scanner;


public class sc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("whats your name : ");
        String name = sc.nextLine();
        System.out.println("Hi " +name + ":)");
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("you were born in "+year);
        if(age>=18)
        {
            System.out.println("eligible to vote");
        }
        else
        {
            System.out.println("not eligible");
        }


    }
}
