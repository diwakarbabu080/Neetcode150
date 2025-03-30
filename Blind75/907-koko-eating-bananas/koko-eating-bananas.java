class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i : piles) {
            max = Math.max(max, i);
        }

        int s = 1, e = max, ans = max;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (ifPossibleToEat(piles, mid, h)) {
                ans = mid;   // Update answer
                e = mid - 1; // Try smaller speed
            } else {
                s = mid + 1; // Increase speed
            }
        }
        return ans;
    }

    public boolean ifPossibleToEat(int[] piles, int mid, int h) {
        long count = 0; // Use long to prevent overflow

        for (int i : piles) {
            count += (i + mid - 1) / mid; // Same as Math.ceil(i / mid)
        }
        return count <= h;
    }
}
