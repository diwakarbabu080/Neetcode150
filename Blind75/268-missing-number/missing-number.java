class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i  = 0;i<=n; i++){
            xor = xor^i;
        }

        for(int i : nums){
            xor = xor^i;
        }
        return xor;
    }
}