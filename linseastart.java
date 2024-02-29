package gaya.base;

public class linseastart {
    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 7, 9};
        //int target=11;
        //   int ans=ls(arr,tar);
        System.out.println(ls(arr, 7, 1, 4));
    }

    static int ls(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
             /*   for (int element : arr) {
                    if (element == target) {

                        return true;
                    }
                }*/


        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}










