class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int posIndex = 0; // Index for positive numbers (0, 2, 4...)
        int negIndex = 1; // Index for negative numbers (1, 3, 5...)

        // Place each number in its correct position in the result array
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; // Move to next even position
            } else {
                result[negIndex] = num;
                negIndex += 2; // Move to next odd position
            }
        }

        return result;
    }
}