class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0; // Handle edge case

        int maxSoFar = nums[0]; // Tracks the maximum product at any point
        int minSoFar = nums[0]; // Tracks the minimum product, useful for negative numbers
        int globalMax = nums[0]; // Stores the maximum product found in the entire array

        // Iterate through the array, starting from the second element
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If the current number is negative, swap maxSoFar and minSoFar
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Compute the max and min products including the current number
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update the global maximum
            globalMax = Math.max(globalMax, maxSoFar);
        }
        return globalMax;
    }
}
