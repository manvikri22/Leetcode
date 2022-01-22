class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <=1)
        {
            return intervals;
        }
        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> output = new ArrayList<>();
        int[] cur;
        cur = intervals[0];
        output.add(cur);
        for(int [] interval : intervals)
        {
            int cur_beg = cur[0];
            int cur_end = cur[1];
            int next_beg = interval[0];
            int next_end = interval[1];
            if(cur_end >=next_beg)
            {
                cur[1] = Math.max(cur_end,next_end);
            }
            else
            {
                cur = interval;
                output.add(cur);
            }
            
        }
        return output.toArray(new int[output.size()][]);
    }
}