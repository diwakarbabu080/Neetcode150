class Solution {
    public void sortColors(int[] nums) {
        

        int left = 0;
        int right = nums.length-1;

        for(int i = 0; i<= right ; i++){
            if(nums[i] == 0){
                int temp = nums[left];
                nums[left] = 0;
                nums[i] = temp;
                left++;
                // i--;
                
            }else if(nums[i] == 2){
                
                int temp = nums[right];
                nums[right] = 2;
                nums[i] = temp;
                right--;
                i--;

                
            }
        }
    }
}