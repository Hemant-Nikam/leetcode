class Solution {
    public int removeDuplicates(int[] nums) {
        int unique[] = new int[nums.length];
        Set <Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;

        while(i < nums.length){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                unique[j++] = nums[i++];
            }
            else{
                i++;
            }
        }
        
        for(i = 0;i<j ;i++){
            nums[i] = unique[i];
        }
        return j;
    }
}