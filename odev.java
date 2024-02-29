package gaya.base;

public class odev {
    public static void main(String[] args) {
        int[] num = {123, 567, 937, 2};
        System.out.println(digits2( 9077));
        System.out.println(find(num));
    }

    static int find(int[] num) {
        int count = 0;
        for (int nums : num) {
            if (even(nums)) {
                count++;

            }
        }
        return count;
    }

    static boolean even(int num) {
        int numbers = digits(num);
        return numbers % 2 == 0;

    }
    static int digits2(int num)
    {
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);

    }


    static int digits(int num) {


        if (num > 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}