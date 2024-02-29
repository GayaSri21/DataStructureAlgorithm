package gaya.base;

public class count {
    public static void main(String[] args) {
        int[] arr = {2,2,2,8,9};
        System.out.println(RotatedCount(arr));
        System.out.println(pivot(arr));
        System.out.println();

    }

    private static int RotatedCount(int[] arr) {
        int cou = dups(arr);
        return cou + 1;
    }

    static int pivot(int[] arr) {
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

        return -1;
    }

    static int dups(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (start < m && arr[m] < arr[m + 1]) {
                return m + 1;
            }
            if (end > m && arr[m] < arr[m - 1]) {
                return m - 1;
            }
            if (arr[m] == arr[start] && arr[m] == arr[end]) {
                if (arr[start] > arr[m]) {
                    return start;
                }
                start++;
                if (arr[m] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            if (arr[start] < arr[m] || arr[start] == arr[m] && arr[end] < arr[m]) {
                start = m + 1;
            }
            end = m - 1;
        }
        return-1;
}
}