class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for(int i : digits)
        {
            sum += i;
        }
        if(sum == (9 * digits.length))
        {
            int arr[] = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }

        else
        {
            boolean carry = true ;

            for(int i = digits.length -1 ; i >= 0  ; i--)
            {
                if(digits[i] == 9 && carry)
                {
                    digits[i] = 0;
                }
                else if(carry)
                {
                    digits[i] += 1;
                    carry = false;
                }
            }

        }
        return digits;
    }
}