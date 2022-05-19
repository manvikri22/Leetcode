class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<=0)
        {
            return 0;
        }
        int maxans = Integer.MIN_VALUE;
        Set<Character> h = new HashSet<>();
        int l =0;
        for(int i =0;i<s.length();i++)
        {
            if(h.contains(s.charAt(i)))
            {
                while(l<i && h.contains(s.charAt(i)))
                {
                    h.remove(s.charAt(l));
                    l++;
                }
            }
            
            h.add(s.charAt(i));
            maxans = Math.max (maxans, i-l+1);
            
        }
        return maxans;
    }
}