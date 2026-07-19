class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        while(i < nums.length -1){
            if(nums[i] != nums[j]){
                i++;
                j++;
            }else{
                return true;
            }
        }
        return false;
    }
}