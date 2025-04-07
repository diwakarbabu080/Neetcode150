import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;

        for (int num : nums) {
            if (!set.contains(num)) continue;
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                set.remove(num);
                while (set.contains(currentNum + 1)) {
                    // set.remove(currentNum);
                    currentNum++;
                    set.remove(currentNum);
                    count++;
                }

                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}
