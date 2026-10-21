class Solution {
    public int missingNumber(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i : nums)
        {
            max = Math.max(max , i);
            min = Math.min(min , i);
            sum += i;
        }
        if(min != 0)
            return 0;
        int total = (max + 1) * max / 2 ;
        if(total == sum)
            return max + 1;
        return Math.abs(sum - total);
    }
}