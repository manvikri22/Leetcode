class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {};
        for i in range(len(nums)):
            snum = target - nums[i];
            if (snum in dict.keys()):
                sindex = nums.index(snum)
                if(i!= sindex):
                    return sorted([i,sindex])
            
            dict.update({nums[i]:i})