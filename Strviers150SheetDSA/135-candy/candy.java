class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;
        int left[] = new int[n];

        int right[] = new int[n];
        int ans [] = new int[n];

        left[0] = right[n-1] = 1;

        
        for(int i = 1;i<n; i++){
            if(ratings[i]>ratings[i-1]){
                left[i] = left[i-1]+1;
            }else{
                left[i] = 1;
            }
        }
        int sum =  Math.max(1, left[n-1]);
        int curr = Math.max(1, left[n-1]);
         for(int i = n-2;i>=0; i--){
            if(ratings[i]>ratings[i+1]){
                curr = curr+1;

            }else{
                // right[i] = 1;
                curr = 1;
            }
            sum += Math.max(left[i],curr );
        }
        
        return sum;
        
    }
}

