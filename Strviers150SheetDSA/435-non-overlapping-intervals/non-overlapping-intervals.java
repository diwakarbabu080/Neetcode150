class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 1;  // We always count the first interval
        int lastEnd = intervals[0][1];  // Set the first interval's end time
        // Arrays.sort(inter)
        // Step 2: Iterate through remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // If the current interval starts after or at the last picked interval's end
            if (intervals[i][0] >= lastEnd) {
                count++;  // Count the non-overlapping interval
                lastEnd = intervals[i][1];  // Update lastEnd to current interval's end time
            }
        }
        
        // Step 3: Return the total intervals minus the non-overlapping ones
        return intervals.length - count;

    }
}
