// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    // } Driver Code Ends


class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    int[][]dp = new int[M+1][V+1];
    
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i == 0) dp[i][j] = 10000000;
                if(j == 0) dp[i][j] = 0;
            }
        }
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(coins[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j] ,1+dp[i][j-coins[i-1]] );
                }
            }
        }
        
        if(dp[M][V] == 10000000) return -1;
        
        return dp[M][V];
	} 
}