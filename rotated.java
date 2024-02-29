package gaya.base;

public class rotated {
    public static void main(String[] args) {
        int[] arr = {7,0,1,2,4,5,6};
        System.out.println(peak(arr));
         int target = 3;
        System.out.println(findpivot(arr));
        System.out.println(search(arr,target));
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

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;

            if (m < end && arr[m] > arr[m + 1]) {
                return m;
            }
            if (m > start && arr[m] > arr[m - 1]) {
            return m - 1;
        }
    }
    return-1;
}


    static int peak(int[] arr) {   //find rotated element with duplicate array elements
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (m < end && arr[m] > arr[m + 1]) {
                return m;
            }
            if (m > start && arr[m] < arr[m - 1]) {
                return m - 1;
            }
            if (arr[m] == arr[start] && arr[m] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;

                }
                end--;


            } else if (arr[start] < arr[m] || arr[start] == m && arr[end] < arr[m]) {
                start = m + 1;
            } else {
                end = m - 1;
            }

        }
        return -1;
    }
}







