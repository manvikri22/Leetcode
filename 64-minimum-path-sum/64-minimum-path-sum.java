class Solution {
    static int[][] memo;
  public static int minPathSum(int[][] grid) {

            int height = grid.length;
            int width = grid[0].length;
      
             memo = new int[height+1][width+1];
            return min(grid, height - 1, width - 1,memo);
			
        }
		
    public static int min(int[][]grid, int m, int n,int[][]memo){

       if(m==0 && n==0)
            return grid[0][0];
        
        else if(m<0 || n<0)
            return Integer.MAX_VALUE;
        
        else if(memo[m][n]!=0)
            return memo[m][n];
        else
            return memo[m][n] =  grid[m][n] + Math.min(min(grid, m-1, n, memo),min(grid, m, n-1, memo)); 
    }
}