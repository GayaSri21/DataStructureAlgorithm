package gaya.base;

public class findmin {
    public static void main(String[] args) {
        int[] nums = {-900000000,2, 4, 6, 8, 90, 0};
        System.out.println(min(nums));
    }

    static int min(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i > nums.length; i++) {
            if (nums[i] < temp) {
                temp = nums[i];
            }
        }
        return temp;
    }
}




