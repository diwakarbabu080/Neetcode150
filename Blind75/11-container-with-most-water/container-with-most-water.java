class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        int left = 0;
        int right = height.length-1;

        int diff = 0;
        while(left<right){
            int minHeight = Math.min(height[left], height[right]);
            diff = right-left;
            maxArea = Math.max(maxArea, diff*minHeight);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
        
        
    }
}