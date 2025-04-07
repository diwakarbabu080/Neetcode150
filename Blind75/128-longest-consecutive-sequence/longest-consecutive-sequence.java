import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Edge case: empty array
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Add all numbers to HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxLength = 0;
        
        // Check each number, but only start counting sequences at the beginning of each sequence
        for (int num : set) {
            // Only process this number if it's the start of a sequence
            // (i.e., num-1 is not in the set)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                // set.remove(currentNum);
                int currentLength = 1;
                
                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    // set.remove(currentNum);
                    currentLength++;
                }
                
                // Update max length if current sequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}