package gaya.base;

public class peak {
    public static void main(String[] args) {
      int[] arr={1,2,3,10,4,5,6}  ;
     // int target=6;
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int start=0;

        int end=arr.length-1;
        while(start<end){
            int m=start+(end - start)/2;
            if(arr[m]>arr[m+1]) {
                end = m;
            }
            else {
                start=m+1;

            }
        }
        return end ;
    }
}
