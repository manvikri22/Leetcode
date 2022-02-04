// { Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    long countPS(String s)
    {
        int n = s.length();
        
        if(n == 1)
            return 1;
            
        int[][] dp = new int[n][n];
        
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                if(g == 0)
                    dp[i][j] = 1;
                    
                else if(g == 1){
                    if(s.charAt(i) == s.charAt(j))
                        dp[i][j] = 3;
                    else
                        dp[i][j] = 2;
                }
                else{
                    if(s.charAt(i) == s.charAt(j))
                        dp[i][j] = (dp[i+1][j] + dp[i][j-1] + 1)%1000000007;
                    else
                        dp[i][j] = (dp[i+1][j] + dp[i][j-1]- dp[i+1][j-1])%1000000007;
                }
                
                if (dp[i][j] < 0) dp[i][j] += 1000000007;
            }
        }
        
        return dp[0][n-1]%1000000007;
    }
}