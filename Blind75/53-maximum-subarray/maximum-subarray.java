class Solution {
    public int maxSubArray(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            
            if(arr[i]+sum<=0){
                maxSum = Math.max(arr[i]+sum, maxSum);
                sum = 0;
            }else{
                sum =  sum+arr[i];
                 maxSum = Math.max(sum, maxSum);
                
            }
          
        }
        return maxSum;
    }
}