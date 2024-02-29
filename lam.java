package gaya.GEN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class lam {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arr.add(i * 5);
        }
        // arr.forEach((item)-> System.out.println(item*2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 1 );
        arr.forEach(fun);


        operation sum = (a, b) -> a + b;

        operation prod = (a, b) -> a * b;
        operation add = (a, b) -> a + b;

        lam mycalculator = new lam();
        System.out.println(mycalculator.opera(5,8,add));


    }
    private int opera(int a, int b, operation op) {
        return op.ope(a, b);

    }
}
interface operation {
    int ope(int a,int b);
}
