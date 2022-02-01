// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
     String s1 = s;
        String s2 = t;
        int m = s1.length();
        int n = s2.length();
        
        int dp[][] = new int[m+1][n+1];
        
        return solution(s1 , s2 , m , n , dp);
    }
    
    static int solution(String s1 , String s2 , int m , int n , int dp[][]){
        
        for(int i=0 ; i<=m ; i++){
            for(int j=0 ; j<=n ; j++){
                
                if(i==0)
                    dp[i][j] = j;
                
                if(j==0)
                    dp[i][j] = i;
            }
        }
        dp[0][0] = 0;
        
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++){
                
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1] , Math.min(dp[i][j-1] , dp[i-1][j]));
                }
            }
        }
        return dp[m][n];
    }
}