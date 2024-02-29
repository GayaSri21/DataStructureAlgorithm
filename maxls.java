package gaya.base;

import java.util.Arrays;

public class maxls {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 6,},
                {44, 77, 8},
                {55, 8}};
        int num = 100;
        System.out.println(max(nums));
        //search(nums,num)-return format will be like this{row,col}

      System.out.println(Arrays.toString(search(nums, num)));
    }

    static int max(int[][] nums) {
        int temp = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            int[] num = nums[j];
            for (int k = 0; k < num.length; k++) {
                int i = num[k];
                if (i > temp) {
                    temp = i;

                }
            }
        }

        return temp;
    }


            static int[] search(int[][] nums,int num){
            for (int row = 0; row < nums.length; row++) {
                for (int col = 0; col < nums[row].length; col++) {
                    if (nums[row][col] == num) {
                        return new int[]{row, col};
                        //same goes here
                    }                 //same goes here.
                }
            }
            return new int[]{-1,-1};
        }           //new int[]-declaration
    }              //{-1,-1}










