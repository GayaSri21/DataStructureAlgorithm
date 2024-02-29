package gaya;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter the operator:");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                System.out.println("enter the two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;

                }
            }
                else if (op == 'x' || op == 'X') {

                    break;
                }
                else {
                    System.out.println("enter the correct value");
                }
                System.out.println(ans);
            }
        }

}