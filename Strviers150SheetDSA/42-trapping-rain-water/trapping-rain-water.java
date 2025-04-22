class Solution {
    public int trap(int[] height) {

        if (height == null || height.length <= 1) return 0;


        int leftMax = height[0];
        int left = 0;
        int right = height.length-1;
        int rightMax = height[height.length-1] ;
        int trapped = 0;

        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>= leftMax){
                    leftMax = height[left];
                }else{
                    trapped+= leftMax- height[left];
                }
                left++;
            }else{
                if(height[right]>=rightMax){
                    rightMax = height[right];
                }else{
                    trapped+= rightMax- height[right];
                }
                right--;
            }
        }
        return trapped;
        
    }
}