package gaya.base;

public class floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=(floo(arr,target));
        System.out.println(ans);
    }
    static int floo(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){
            int m = start + (end - start) / 2;
            if(arr[m]==target)
            {
                return m;
            }
        if(asc)
        {
            if (target<arr[m])
            {
                end = m - 1;
            }
            else
            {
                start = m + 1;
            }
        }
        else
        {
            if(target>arr[m])
            {
                start=m+1;
            }
            else
            {
                end=m-1;
            }

            }
        }
       return end;
    }
}
