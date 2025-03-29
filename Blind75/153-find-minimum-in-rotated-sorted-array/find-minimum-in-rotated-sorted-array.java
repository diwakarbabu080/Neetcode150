class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            // Compare with arr[e] instead of arr[0]
            if (arr[mid] > arr[e]) {
                s = mid + 1; // Minimum is in the right half
            } else {
                e = mid; // Minimum is in the left half (including mid)
            }
        }
        
        // Return the minimum element
        return arr[s];  // or arr[e], both are same when loop exits
    }
}
