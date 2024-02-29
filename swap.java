package gaya.base;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] num = {1,3,5,7,9,55};
       // Swa(num,0,3);
reverse(num);
      System.out.println(Arrays.toString(num));
        reverse(num);


    }
    static void reverse(int[] num){
        int start=0;
        int end=num.length-1;
        while(start<end){
            Swa(num,start,end);
            start++;
            end--;
        }

    }

    static void Swa(int[] num, int index1, int index2) {

        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;




    }
}

