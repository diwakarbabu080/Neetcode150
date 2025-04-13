class Solution {
    public int removeDuplicates(int[] nums) {

        int counter = 1;
        int prev  = nums[0];
        for(int i = 1; i<nums.length; i++){

            while(i<nums.length && nums[i] == prev){
                nums[i] = 101;
                i++;
            }
            if(i<nums.length){
                prev =  nums[i] ;
            }
           
            
        }

        int index = 1;
        for(int i = 1; i<nums.length; i++){

            if(nums[i] != 101){
                int temp = nums[index];
                nums[index] = nums[i];
                // nums[i] = temp;
                index++;
            }

        }
        // System.out.println(Arrays.toString(nums)+" "+(index)+" ");
        return index;
        
    }
}