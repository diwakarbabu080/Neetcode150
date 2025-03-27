class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        
        int start = 0, end = 0, sum = 0;
        int minLength= Integer.MAX_VALUE;

        for(end = 0; end< arr.length; end++){
            sum += arr[end];
            
            while(sum>=k){

                minLength = Math.min(minLength, end-start+1);
                sum -=arr[start];
                start += 1;
            }
        }
        return minLength == Integer.MAX_VALUE? 0:minLength;

    }
}