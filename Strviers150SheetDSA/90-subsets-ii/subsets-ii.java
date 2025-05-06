class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subsetsWithDupHelper(nums, ans, 0, new ArrayList<>());
        return ans;

    }

    public void subsetsWithDupHelper(int[] nums, List<List<Integer>> ans, int index,
            List<Integer> temp) {

        ans.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {

            if(i>index && nums[i] == nums[i-1])continue;

            temp.add(nums[i]);
            subsetsWithDupHelper(nums, ans, i+1, temp);
            temp.remove(temp.size()-1);
        }
         

    }
}
