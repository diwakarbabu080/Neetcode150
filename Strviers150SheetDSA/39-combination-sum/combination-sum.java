class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        combinationSumHelper(ans, candidates, target, 0, new ArrayList<>());
        return ans;
    }

    public void combinationSumHelper( List<List<Integer>> ans, int[] candidates, int target, int index , List<Integer>temp){

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        temp.add(candidates[index]);
        combinationSumHelper(ans, candidates,target-candidates[index], index, temp);
        temp.remove(temp.size()-1);
        combinationSumHelper(ans, candidates, target, index+1, temp);

    }
}