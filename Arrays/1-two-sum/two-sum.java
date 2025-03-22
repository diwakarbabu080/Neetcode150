class Solution {
    public int[] twoSum(int[] nums, int target) {

        /*
            Approach 1
            1. for every num check in whole array if you find val = target-num return num, val

        */

        /*
        Appraach 2 

        1. for every number store (target-num, index)in hashmap 
        before adding this check if num value is   already present in hashmap


        */

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int a = 0;
        int b = 0;
        for(int i = 0; i< nums.length; i++){
            a = i;
            if(!map.containsKey(nums[i])){
                map.put(target-nums[i], i);
            }
            else{
                b = map.get(nums[i]);
              return new int[]{a,b};
            }
        }
        return new int[]{-1,-1};
        //   return new int[]{a,b};
    }
}