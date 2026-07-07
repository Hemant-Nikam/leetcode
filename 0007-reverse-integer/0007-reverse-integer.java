class Solution {
    public int reverse(int x) {

        if (x == 0)
            return 0;

        long sign = 1;

        long num = x;

        if (num < 0) {
            sign = -1;
            num = -num;
        }

        StringBuilder ans = new StringBuilder();

        while (num > 0) {
            ans.append(num % 10);
            num /= 10;
        }

        long n = Long.parseLong(ans.toString());

        if (n > Integer.MAX_VALUE)
            return 0;

        return (int)(n * sign);
    }
}