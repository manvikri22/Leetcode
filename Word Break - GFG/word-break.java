// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    
   public static int wordBreak(String A, ArrayList<String> B )
   {
       int count=0;
       if(A.length()==0)
           count++;
       for(int k=1;k<=A.length();k++)
       {
           int temp=0;
           if(B.contains(A.substring(0,k)))
             temp+=wordBreak(A.substring(k),B);
           count+=temp;  
       }       
         return count;
       
   }
   
}