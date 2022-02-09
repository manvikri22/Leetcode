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
            System.out.println(ob.minimumNumberOfSwaps(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int minimumNumberOfSwaps(String S){
       int c = 0;int sum = 0;
       for(int i =0;i<S.length();i++){
           if(S.charAt(i) == ']') c = c + 1;
           else{
              if(c>0) sum = sum + c;
               c = c - 1;
           }
       }
       return sum;
   }
}