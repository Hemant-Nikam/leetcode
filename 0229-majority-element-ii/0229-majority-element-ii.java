class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0 , cnt2 = 0;
        int num1 = Integer.MIN_VALUE , num2 = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(cnt1 == 0 && num2 != nums[i])
            {
                num1 = nums[i];
                cnt1++ ;
            }
            else if(cnt2 == 0 && num1 != nums[i])
            {
                num2 = nums[i];
                cnt2++ ;
            }
            else if(nums[i] == num1)
            {
                cnt1++;
            }
            else if(nums[i] == num2)
            {
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int min = nums.length/3 +1;
        cnt1 = cnt2 = 0 ;
        List<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < nums.length;i++)
        {
            if(nums[i] == num1)
                cnt1++;
            else if(nums[i] == num2)
                cnt2++;
            if(cnt1 >= min)
            {
                lst.add(num1);
                cnt1 = Integer.MIN_VALUE;
            }
            if(cnt2 >= min)
            {
                lst.add(num2);
                cnt2 = Integer.MIN_VALUE;
            }
        }
        return lst;
    }
}