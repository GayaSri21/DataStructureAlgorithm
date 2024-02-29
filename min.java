package gaya.base;

public class min {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 44, 6},
                {44, 77, -8},
                {55, 8}
        };

        int minValue = findMin(nums);

        System.out.println("The minimum value in the array is: " + minValue);
    }

    static int findMin(int[][] nums) {
        // Initialize a variable to store the minimum value found so far.
        int min = Integer.MAX_VALUE;

        // Iterate through each row in the 2D array.
        for (int i = 0; i < nums.length; i++) {
            // Get the current row.
            int[] row = nums[i];

            // Iterate through each element in the current row.
            for (int j = 0; j < row.length; j++) {
                int currentElement = row[j];

                // Check if the current element is less than the current minimum.
                if (currentElement < min) {
                    // If it is, update the minimum value.
                    min = currentElement;
                }
            }
        }

        // Return the minimum value found in the array.
        return min;
    }
}
