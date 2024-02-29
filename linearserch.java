package gaya.base;
public class linearserch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        //int target=11;
        //   int ans=ls(arr,tar);
        System.out.println(ls(arr, 00));
    }

    static boolean ls(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {

                return true;
            }
        }
            

       /* for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index ;*/

        return false;
    }
}



