class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(sum + nums[i] < 0)
            {
                sum = 0;
                max = Math.max(max,nums[i]);
            }
            else{

                sum += nums[i];
                max = Math.max(max,sum);
            }

        }
        return max;
    }
}