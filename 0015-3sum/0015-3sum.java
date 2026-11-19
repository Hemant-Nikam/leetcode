class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int j = i+1;
        int k = nums.length -1 ;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        while(i < nums.length - 2)
        {
            j = i+ 1;
            k = nums.length -1;
            List<Integer> lst ;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                {
                    k--;
                }
                else if(sum < 0)
                {
                    j++;
                }
                else {
                    lst = List.of(nums[i],nums[j],nums[k]);
                    list.add(lst);
                    j++;
                    k--;
                    while(j < k && nums[j -1] == nums[j])
                        j++;
                    while(j < k && nums[k] == nums[k+1])
                        k--;
                }
            }

            i++;
            while(i < nums.length -2 && nums[i - 1] == nums[i])
                i++;
        }
        return list;
    }
}