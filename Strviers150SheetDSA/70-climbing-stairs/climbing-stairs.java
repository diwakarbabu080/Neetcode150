class Solution {
    public int climbStairs(int n) {

        if(n== 0)return 1;
        if(n== 1)return 1;

        int ans[] = new int[n+1];
        ans[0] = 1;
        ans[1] = 1;

        return climbStairs(n, ans);
        
    }
    public int climbStairs(int n , int ans[]){

        if(ans[n] != 0)return ans[n];
        else{
            if(n== 0)return 1;
        if(n== 1)return 1;
        }

        ans[n] = climbStairs(n-1, ans)+climbStairs(n-2, ans);
        return ans[n];
        
    }
}