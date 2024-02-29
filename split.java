package gaya.base;

public class split {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        System.out.println(sa(arr));
      //  System.out.println(sa();
    }

    static int sa(int[] arr) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start < end) {
            int m = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num=0;num<arr.length;num++) {
                if (sum + num > m) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = m + 1;
            } else {
                end = m;
            }

        }
        return end;
    }
}




