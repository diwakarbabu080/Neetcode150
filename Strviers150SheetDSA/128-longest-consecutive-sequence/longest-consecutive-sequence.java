class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i:nums)set.add(i);
        int max = 0;
        for(int i = 0; i<nums.length; i++){

            int count = 0;
            if(!set.contains(nums[i]-1)){
                count+=1;
                while(set.contains(nums[i]+count)){
                    set.remove(nums[i]+count);
                    count++;
                   
                    // i++;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
}