class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Important to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> temp, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // 1. Include current element
        temp.add(nums[index]);
        backtrack(nums, index + 1, temp, result);
        temp.remove(temp.size() - 1);

        // 2. Skip current element AND all its duplicates
        int next = index + 1;
        while (next < nums.length && nums[next] == nums[index]) {
            next++;
        }
        backtrack(nums, next, temp, result);
    }
}
