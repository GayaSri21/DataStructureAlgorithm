package gaya.base;

public class tarinmount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target =5;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {

        int peak = peak(arr);
        int first = binsea(arr, target, 0, peak);
        if (first != -1) {
            return first;
        }
        return binsea(arr, target, peak + 1, arr.length - 1);

    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int m = start + (end - start) / 2;
            if (arr[m] > arr[m + 1]) {
                end=  m;
            } else {
                start=m+1;
            }

        }
        return end;
    }


    public static int binsea(int[] arr, int target, int start, int end) {
        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (arr[m] ==target) {
                return m;
            }
            if (asc) {
                if (target < arr[m]) {
                    end = m - 1;
                } else {
                    start = m + 1;
                }
            } else {


                if (target > arr[m]) {
                    start = m + 1;
                } else {
                    end = m - 1;

                }
            }
        }
        return -1;
    }
}


