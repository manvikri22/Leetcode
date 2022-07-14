class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                dp[i][j] = -1;
            }
        }
        
        return solve(obstacleGrid, dp, n-1, m-1);
    }
    
    public int solve(int[][] arr, int[][]dp, int i, int j)
    {
        if(i>=0 && j>=0 && arr[i][j] ==1) return 0;
        
        if(i==0 && j ==0) return 1;
        
        if(i<0 || j<0) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        int up = solve(arr, dp, i-1,j);
        int left = solve(arr,dp,i,j-1);
        
        return dp[i][j] = up +left;
    }
}