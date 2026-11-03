class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int pos[] = new int[len/2];
        int  p = 0;
        int neg []= new int[len/2];
        int n = 0;

        for(int i = 0 ; i < len ; i ++)
        {
            if(nums[i] > 0)
            {
                pos[p++] = nums[i];
            }
            else{
                neg[n++] = nums[i];
            }
        }
        p = 0;
        n = 0 ;
        for(int i = 0 ; i < len ;i = i + 2)
        {   
            nums[i] = pos[p++];
            nums[i + 1] = neg[n++];
        }

        return nums;
    }
}