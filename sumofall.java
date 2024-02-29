package gaya.base;

import java.util.Scanner;

public class sumofall {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int sum=0;


        while (true) {
            System.out.println("enter:");
            int num = sc.nextInt();


            if (num == 0) {
                System.out.println("stop");
                break;
            }
            sum += num;

        }
        System.out.println("sums are   "+ sum);
    }
    }


