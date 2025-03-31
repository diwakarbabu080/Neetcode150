class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, (right - left) * minHeight);

            // Move pointers more aggressively by skipping duplicate heights
            while (left < right && height[left] <= minHeight) left++;
            while (left < right && height[right] <= minHeight) right--;
        }
        return maxArea;
    }
}
