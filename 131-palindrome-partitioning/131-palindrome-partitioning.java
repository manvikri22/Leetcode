class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(0,path, res, s);
        return res;
    }
    
    public void solve(int index, List<String> path, List<List<String>> res, String s)
    {
        if(index == s.length())
        {
            res.add(new ArrayList<>(path));
            return;
        }
        
        for(int i = index; i<s.length();i++)
        {
            if(ispalin(index, i, s))
            {
                path.add(s.substring(index,i+1));
                solve(i+1,path,res,s);
                path.remove(path.size()-1);
            }
        }
    }
    
    public boolean ispalin(int i, int j, String s)
    {
        while(i<=j)
        {
            if(s.charAt(i++)!= s.charAt(j--)) 
                return false;
                
        }
        return true;
    }
}