package gaya;

public class state {
    public static void main(String args[]){
        int age=18;

        if (age>=18) {
            System.out.println("eligible to vote");
        }
        else if (age<=16 && age>=18) {
            System.out.println("almost eligible");
        }
        else {
            System.out.println("not eligible");


        }
    }
}
