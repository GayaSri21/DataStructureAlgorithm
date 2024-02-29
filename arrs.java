package gaya.kunal;
import java.util.Arrays;
import java.lang.String;

public class arrs {
    public static void main(String[] args) {
        int [][] arr = {
                      {1,2,3},

                      {4,5,6},

                      {7,8}};

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col]+ " ");
            }
            System.out.println();
        }


     //   System.out.println(Arrays.toString(arr));
    }
}
