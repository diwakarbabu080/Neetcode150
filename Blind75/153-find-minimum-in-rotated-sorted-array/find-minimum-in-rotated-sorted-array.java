class Solution {
    public int findMin(int[] arr) {
        int s = 0,n=arr.length, e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[e]) {
                e = mid; // Move right, since peak is on right side
            } else {
                s = mid+1; // Move left, since we may have found peak
            }
        }

        return arr[s];  
    }
}
