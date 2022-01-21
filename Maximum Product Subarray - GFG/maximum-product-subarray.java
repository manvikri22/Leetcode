// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long l =1, r=1, ans = Integer.MIN_VALUE;
        if(n==0)
        {
            return -1;
            
        }
        if(n==1)
        {
            return arr[0];
        }
        for(int i=0;i<n;i++)
        {
            l= l*arr[i];
            r = r*arr[n-i-1];
            long temp = Math.max(l,r);
            ans = Math.max(ans,temp);
            if(l==0) l=1;
            if(r==0) r=1;
        }
        return ans;
    }
}