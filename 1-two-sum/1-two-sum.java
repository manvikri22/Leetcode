class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int snum = target- nums[i];
            if(h.containsKey(snum))
            {
               return new int[] {i, h.get(snum)};
                
            }
             h.put(nums[i], i);
           
        }
         return null;
    }
}
