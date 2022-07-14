class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0] = nums[0];
        int neg =0;
        
        for(int i =1;i<nums.length;i++)
        {
            int take = nums[i];
            if(i>1)
                take+=dp[i-2];
            int nontake = 0+ dp[i-1];
            
            dp[i] = Math.max(take,nontake);
        }
        return dp[nums.length-1];
        
       // return solve(dp,nums.length-1, nums);
    }
    
   /** public int solve(int[] dp,int ind, int[] nums)
    {
        if(ind<0) return 0;
        if(ind ==0)return nums[0];
        if(dp[ind]!= -1) return dp[ind];
        
        
        int pick = nums[ind]+solve(dp,ind-2,nums);
        int nonpick = 0+ solve(dp,ind-1,nums);
        
        return dp[ind] = Math.max(pick,nonpick);
    }**/
}