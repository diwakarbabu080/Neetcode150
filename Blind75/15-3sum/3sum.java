class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int start = i+1;
            int end = nums.length-1;

            while(start<end){
                if(nums[start]+nums[end]+nums[i] == 0){
                    List<Integer> temp = new ArrayList<>();
                    
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    temp.add(nums[i]);
                    Collections.sort(temp);
                    if(!set.contains(temp)){
                        set.add(temp);
                         ans.add(temp);
                    }

                    // ans.add(temp);
                    start++;
                    end--;

                }else if(nums[start]+nums[end]+nums[i]<0){
                    start++;
                    
                }else{
                    end--;
                }

            }
        }
        return ans;
    }
}