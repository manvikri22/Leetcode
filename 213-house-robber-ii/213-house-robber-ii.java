class Solution {
    public int rob(int[] nums) {
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        if(nums.length ==1 ) return nums[0];
        int j =0;
        int k=0;
        for(int i =0;i<nums.length;i++)
        {
            if(i!=0)
            {
                temp1[j++] = nums[i];
            }
            if(i != nums.length-1)
            {
                temp2[k++] = nums[i];
            }
        }
        return Math.max(solve(temp1),solve(temp2));
    }
    
    public int solve(int[] nums) {
        int prev = nums[0];
        int prev2 =0;
        //int[] dp = new int[nums.length];
        //Arrays.fill(dp,-1);
        //dp[0] = nums[0];
        
        
        for(int i =1;i<nums.length;i++)
        {
            int take = nums[i];
            if(i>1)
                take+=prev2;
            int nontake = 0+ prev;
            
            int curi = Math.max(take,nontake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
        
       // return solve(dp,nums.length-1, nums);
    }
}