class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1, suffix = 1;
        
        int ans [] = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i<nums.length; i++){
            int prev = nums[i-1];
            prefix = prev*prefix;
            ans[i] = prefix;

            
        }
        
        for(int i = nums.length-2;i>=0; i-- ){
            suffix = suffix*nums[i+1];
            ans[i] = ans[i]*suffix;
        }
        return ans;
        
    }
}