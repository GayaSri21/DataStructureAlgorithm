package gaya.base;

public class cha {


        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 3, 1};
            int target = 3;
            System.out.println(search(arr, target));
        }

        static int search(int[] arr, int target) {
            int peak = findPeak(arr);
            int first = binarySearch(arr, target, 0, peak);
            if (first != -1) {
                return first;
            }
            return binarySearch(arr, target, peak + 1, arr.length - 1);
        }

        static int findPeak(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int m = start + (end - start) / 2;
                if (arr[m] < arr[m + 1]) {
                    start = m + 1;
                } else {
                    end = m;
                }
            }
            return start;
        }

        public static int binarySearch(int[] arr, int target, int start, int end) {
            while (start <= end) {
                int m = start + (end - start) / 2;
                if (arr[m] == target) {
                    return m;
                }
                if (target < arr[m]) {
                    end = m - 1;
                } else {
                    start = m + 1;
                }
            }
            return -1; // Target not found in the specified range
        }
    }


