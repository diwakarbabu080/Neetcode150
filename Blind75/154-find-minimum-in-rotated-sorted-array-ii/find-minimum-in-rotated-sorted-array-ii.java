class Solution {
    public int findMin(int[] arr) {
        int s = 0, e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > arr[e]) {
                s = mid + 1;  // Minimum is in the right half
            } else if (arr[mid] < arr[e]) {
                e = mid;  // Minimum is in the left half (including mid)
            } else {
                e--;  // Reduce e by 1 to remove duplicate effect
            }
        }

        return arr[s];  // or arr[e], since s == e
    }
}
