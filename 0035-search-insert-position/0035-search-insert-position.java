class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0 ; 
        int j = nums.length - 1;
        int idx = 0 ;
        while(i <= j)
        {
            int mid = i + (j - i ) / 2 ;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
            {
                idx = i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
    return idx;
    }
}