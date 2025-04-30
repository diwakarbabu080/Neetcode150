class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            if(i+sum<0){
                sum = i;
            }else{
                sum = Math.max(sum+i, i);
            }
            max = Math.max(max, sum);
        }
        return max;

    }
}