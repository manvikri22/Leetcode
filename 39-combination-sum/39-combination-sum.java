class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findcomb(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }
    
    public void findcomb(int ind, int[]arr, int t, List<List<Integer>> ans, List<Integer> ds)
    {
        if(ind == arr.length)
        {
            if(t ==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=t)
        {
            ds.add(arr[ind]);
            findcomb(ind, arr, t-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcomb(ind+1,arr,t,ans, ds);
    }
}