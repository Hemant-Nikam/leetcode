class Solution {
    public int firstMissingPositive(int[] nums) {
        //clean the array:
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i] < 1 || nums[i] > nums.length){
                nums[i] = Integer.MAX_VALUE;
            }
        }
        display(nums);
        //mark the numbers:
        for(int i = 0 ; i< nums.length;i++){
            int val = nums[i] > 0 ? nums[i] : nums[i] * -1;
            if(val != Integer.MAX_VALUE ){
                nums[val - 1] =nums[val -1] > 0 ? nums[val -1] * (-1) : nums[val -1];
            }
        }
        display(nums);
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i] > 0 ){
                return i+1;
            }
        }
        display(nums);
        return nums.length+1;

    }
    public void display(int[] arr){

        System.out.println();
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}