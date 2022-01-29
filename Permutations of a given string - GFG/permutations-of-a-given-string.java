// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    ArrayList<String> ans = new ArrayList<>();
    
    void solve(String str, String a)
    {
        if(str.length()==0)
        {
            ans.add(a);
            return;
        }
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            solve(left+right, a+ch);
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        solve(S,"");
        Collections.sort(ans);
        return ans;
    }
}