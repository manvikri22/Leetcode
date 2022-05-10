class Solution {
    public int findDuplicate(int[] nums) {
        
        int farr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
           
            farr[nums[i]] = farr[nums[i]] +1;
             if(farr[nums[i]]>1)
                return nums[i];
            
        }
            
        return -1;
    }
}