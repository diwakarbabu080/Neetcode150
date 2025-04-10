class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
       
        int left = 0;
        int right = 0;
        int n = nums.length;


        while(right<n){

            if(sum+nums[right]< nums[right]){
                sum = nums[right];
               
            }else{
                sum += nums[right];
            }
           
            maxSum = Math.max(sum, maxSum);

            right++;
        }
         
        return maxSum;
    }
}