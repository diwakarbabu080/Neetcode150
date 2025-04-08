class Solution {
    public int maxArea(int[] height) {

        int ans = 0;

        if(height.length <= 1){
            return ans;
        }

        int start = 0;
        int end = height.length-1;

        int leftMax = height[start];
        int rightMax = height[end];

        while(start<end){
            leftMax = height[start];
             rightMax = height[end];
            int width = end-start;
            int len = Math.min(height[start], height[end]);
            ans = Math.max(ans, (width*len));

            if(height[start]<=height[end]){
                start++;
            }else{
                end--;
            }
            while(height[start]<leftMax){
                start++;
            }
            while(height[end]<rightMax){
                end--;
            }


        }
        return ans;

        
    }
}