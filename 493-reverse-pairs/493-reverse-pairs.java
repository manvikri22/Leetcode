class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length-1);
    }
    
    public int mergesort(int [] arr, int low, int high)
    {
        
        if(low>=high) return 0; 
        int mid = (low + high) / 2;
        int inv = mergesort(arr, low, mid); 
        inv += mergesort(arr, mid+1, high); 
        inv += merge(arr, low, mid, high); 
        return inv; 
    }
    public int merge(int [] arr, int low, int mid, int high)
    {
        int cnt =0;
        int j = mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(j<= high && arr[i]> 2*(long)arr[j])
                j++;
            cnt += j-(mid+1);
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right <= high)
        {
            if(arr[left]<= arr[right])
            {
                temp.add(arr[left++]);
            }
            else
           
            {
                temp.add(arr[right++]);
            }
            
            
        }
        while(left<=mid)
        {
            temp.add(arr[left++]);
        }
        while(right<=high)
        {
            temp.add(arr[right++]);
        }
        for(int i = low; i<=high;i++)
        {
            arr[i] = temp.get(i-low);
        }
        
        return cnt;
        
    }
}