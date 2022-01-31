// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String str="";
    int max=0;
     String longestPalin(String S){
        if(S==null || S.length()<1)return "";
        
        for(int i=0;i<S.length();i++){
            expandfromMid(S,i,i);//for odd length
            expandfromMid(S,i,i+1);//for rvrn length
        }
      return str;
    }
    
    void expandfromMid(String S,int left,int right){
        if(left>right) return;
        
        while(left>=0 && right <S.length() && S.charAt(left)==S.charAt(right)){
            left--;
            right++;
        }
        
        int size=right-left+1;
        
        if(size>max){
            str=S.substring(left+1,right);
            max=size;
        }
    }
}