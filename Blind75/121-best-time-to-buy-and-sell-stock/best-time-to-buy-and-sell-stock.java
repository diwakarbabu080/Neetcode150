class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for(int i : prices){
            minPrice = Math.min(i, minPrice);
            max = Math.max(max, i-minPrice);
        }
        return max;
        
    }
}