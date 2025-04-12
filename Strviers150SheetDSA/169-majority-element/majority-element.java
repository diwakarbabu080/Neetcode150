class Solution {
    public int majorityElement(int[] nums) {

        // Using Hashmap : TC : O(N), SC :O(N);
        /*
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)> n/2){
                return i;
            }
        }
        return -1;
        */

        /*
            Moore Voting Algorithm
            1. Basically if we have a voting system and for every vote if we increase the count and for every vote from other condidate decrease the count and can switch candidate if count becomes zero at last we will have count >= 1 for majority element.
        */

        int count= 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count = count+ (num == candidate ? 1: -1);
        }
        return candidate;
    }
}