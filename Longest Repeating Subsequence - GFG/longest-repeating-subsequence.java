// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        String s1 = str;
        String s2 = str;
        int n = s1.length();

        int d[][] = new int[n+1][n+1];
        
        for(int i=0 ; i<n+1 ; i++){
            for(int j=0 ; j<n+1 ; j++){
                
                if(i == 0 || j == 0)
                    d[i][j] = 0;
                
                else if(s1.charAt(i-1) == s2.charAt(j-1) && i != j ){
                    d[i][j] = 1 + d[i-1][j-1];
                }
                else{
                    d[i][j] = Math.max(d[i-1][j] , d[i][j-1]);
                }
            }
        }
        return d[n][n];
    }
}
    