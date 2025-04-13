class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][] = new int[m][n];
        return uniquePathsHelper(m-1, n-1,dp);
    }
    public int uniquePathsHelper(int m , int n, int dp[][]){

        if(m == 0 || n == 0){
            return 1;
        }
        if(dp[m][n] != 0){
            return dp[m][n];
        }

        dp[m][n] = uniquePathsHelper(m-1, n,dp)+uniquePathsHelper(m,n-1,dp);
        return dp[m][n];
    }
}