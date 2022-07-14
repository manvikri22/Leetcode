class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) return 0;
        
        // M[i] represents the min total from bottom to current position
        // copy the last row in triangle to M
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[][] dp = new int[m][m];
        
        for(int j =0 ;j<m;j++)
        {
            dp[m-1][j] = triangle.get(m-1).get(j);
        }
        for(int i = m-2;i>=0;i--)
        {
            for(int j =i;j>=0;j--)
            {
                int d = triangle.get(i).get(j) +dp[i+1][j];
                int dh = triangle.get(i).get(j) +dp[i+1][j+1];
                 dp[i][j] = Math.min(d,dh);
            }
        }
        return dp[0][0];
    }
    
    
}