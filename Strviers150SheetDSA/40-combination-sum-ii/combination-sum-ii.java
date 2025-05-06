class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
     List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Include current candidate
        temp.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index+1, temp, ans);  // Not index+1 because we can reuse the same element
        temp.remove(temp.size() - 1); // backtrack

        int next = index + 1;
        while (next < candidates.length && candidates[next] == candidates[index]) {
            next++;
        }
        // Exclude current candidate
        backtrack(candidates, target, next, temp, ans);
    }
}


