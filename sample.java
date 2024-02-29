package gaya.base;

public class sample {


    public static void main(String[] args) {
        int[] arr = {7,4,8,9,0,7};
        //  System.out.println(peak(arr));
        int target = 8;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = peak(arr);
        if (pivot == -1) {
            return binarysearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;

        }

        if (target >= arr[0]) {
            return binarysearch(arr, target, 0, pivot - 1);
        }
        return binarysearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (target < arr[m]) {
                end = m - 1;
            } else if (target > arr[m]) {
                start = m + 1;
            } else {

                return m;
            }
        }
        return -1;
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > end && arr[mid] < arr[mid + 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                // Handle duplicates by moving the start and end pointers.
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

            return -1; // This represents the pivot index.



    }
}











