package gaya.base;

public class smalett {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target='y';
        char ans=(find(arr,target));
        System.out.println(ans);

    }

    public static char find(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
      //  int n = arr.length - 1;
    /*    boolean asc = arr[start] < arr[end];
        if (target > arr[end]) {
            return (char) (start % n);
        }*/
        while (start < end) {
          //  char m = (char) (start + (end - start) / 2);
            int m=start+(end-start)/2;
           /* if (arr[m] == target) {
                return m;*/

                    if (target < arr[m]) {
                        start = m + 1;
                    } else {
                        end = m - 1;
                    }
                }


            return arr[start % arr.length];
        }
    }



