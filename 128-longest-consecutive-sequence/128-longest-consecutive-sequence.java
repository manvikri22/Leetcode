class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> h = new HashSet<Integer>();
        int lstreak = 0;
        for(int num : nums)
        {
            h.add(num);
        }
        for(int num :nums)
        {
            if(!h.contains(num-1))
            {
                int currentnum = num;
                int cstreak = 1;
                while(h.contains(currentnum+1))
                {
                    currentnum +=1;
                    cstreak +=1;
                }
                lstreak = Math.max(lstreak, cstreak);
            }
            
        }
        return lstreak;
    }
}