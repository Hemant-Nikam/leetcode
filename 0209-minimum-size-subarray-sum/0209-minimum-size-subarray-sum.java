class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE ;
        int i = 0 ; 
        int  j = 0;
        int sum = nums[j];
        while(j < nums.length)
        {
            if(sum < target)
            {
                j += 1;
                if(j<nums.length)
                    sum += nums[j];
            }
            else{
                len = Math.min(len,j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}