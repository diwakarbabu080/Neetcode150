class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;

        int sum = 1;
        int peak = 1;
        int count = 1;
        int down = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                count++; // Increment candy count
                sum += count; // Add to total
                peak = count; // Increment peak (same as peak = count)
                down = 0; // Reset downward slope
            } else if (ratings[i] < ratings[i - 1]) {

                down++;
                sum += down;
                count = 1;
                if (down >= peak) {
                    sum++; // Because peak should be 1 greater than the max 
                }
            } else {

                down = 0;
                count = 1;
                peak = 1;
                sum += count;
            }
            // peak = Math.max(peak, count);

        }
        return sum;

    }
}
