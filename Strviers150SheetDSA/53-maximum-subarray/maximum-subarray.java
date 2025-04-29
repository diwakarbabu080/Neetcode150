class Solution {
    public int maxSubArray(int[] nums) {

        // int sum = 0;
        // int maxSum = Integer.MIN_VALUE;
       
        // int left = 0;
        // int right = 0;
        // int n = nums.length;


        // while(right<n){

        //     if(sum+nums[right]< nums[right]){
        //         sum = nums[right];
               
        //     }else{
        //         sum += nums[right];
        //     }
           
        //     maxSum = Math.max(sum, maxSum);

        //     right++;
        // }
         
        // return maxSum;

          int maxSum = nums[0]; // Initialize with first element
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
}