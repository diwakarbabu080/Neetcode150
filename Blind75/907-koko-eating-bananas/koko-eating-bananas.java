class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i : piles) {
            max = Math.max(max,i);
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

    public boolean ifPossibleToEat(int[] arr, int step, int h) {
        long ans = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%step == 0){
                ans += arr[i]/step;
            }else{
                ans+= (arr[i]/step)+1;
            }
        }
   
        return ans<=h;
    }
}
