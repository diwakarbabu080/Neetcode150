class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int ans = 0;
        for(int i : set){

            int count = 0;
            if(!set.contains(i-1)){
                count+=1;
                while(set.contains(i+1)){
                    i+=1;
                    count+=1;

                }
               
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}