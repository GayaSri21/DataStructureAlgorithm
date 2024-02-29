package gaya.base;

public class infinitenum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 200;
       System.out.println(range(arr, target));


    }


    static int range(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            //  int temp = end + 1;
            //  end = end + (end - start + 1) * 2;
            //   start=temp;
            start = end;
            end = end * 2;
        }
        return BinSearch(arr, target, start, end);

    }

    static int BinSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (target > arr[m]) {
                start = m + 1;
            } else if (target < arr[m]) {
                end = m - 1;
            } else {
                return m;
            }
        }


        return start;
    }

}
