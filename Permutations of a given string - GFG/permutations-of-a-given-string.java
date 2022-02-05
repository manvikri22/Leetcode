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
    
    void solve(String s, int l , int r)
    {
        if(l==r)
        {
            ans.add(s);
            return;
        }
        for(int i =l;i<=r;i++)
        {
            s = swap(s,l,i);
            solve(s, l+1, r);
            s = swap(s,l,i);
            
        }
    }
    String swap(String s, int l , int r)
    {
        char ch [] = s.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        return String.valueOf(ch);
    }
    public List<String> find_permutation(String S) {
        // Code here
        
        solve(S,0,S.length()-1);
        Collections.sort(ans);
        return ans;
    }
}