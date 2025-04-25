class Solution {
    public int jump(int[] nums) {

        int max = 0;
        int counter = 0;
        int currentEnd = 0;
        for (int i = 0; i < nums.length-1; i++) {
            
            
            max = Math.max(max, i + nums[i]);

            if(i == currentEnd){
                counter++;
                currentEnd = max;
            }
            
                // return counter; // we reached or crossed the last index
        }
        return counter;

    }
}
