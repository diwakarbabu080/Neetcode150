class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int xor = 0,xor2 = 0;
        for(int i  = 0;i<n; i++){
            xor = xor^i+1;
            xor2 = xor2^arr[i];
        }

        
        return xor^xor2;
    }
}