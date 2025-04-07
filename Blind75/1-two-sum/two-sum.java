class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Approach using hashmap

        // 1. for every nums[i] check if we have already target-nums[i] 
        // if yes then return i and index(target-nums[i])
        // else add the num[i] and i;

        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i], i);
            }else{
                return new int[]{i, map.get(target- nums[i])};
            }
        }
        return new int[]{-1,-1};
        
    }
}