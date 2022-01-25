// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i =0;i<n;i++)
        {
            int current = arr[i];
            if(map.containsKey(current)){
                if(map.get(current)==1)
                {
                    ans.add(current);
                }
                map.put(current,map.get(current)+1);
            }
            else
            {
                map.put(current,1);
            }
        }
            Collections.sort(ans);
            if(ans.isEmpty()) ans.add(-1);
            return ans;
    }
}
