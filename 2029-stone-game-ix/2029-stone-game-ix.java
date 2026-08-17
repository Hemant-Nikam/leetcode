class Solution {
    public boolean stoneGameIX(int[] stones) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i : stones)
        {
            if(i%3 == 0)
                c0++;
            else if(i % 3 == 1)
                c1++;
            else
                c2++;
        }
        if(c0 % 2 == 0)
        {
            return (c1 >= 1  && c2 >= 1) && (c1 >= c2 || c2 >= c1); 
        }
        return (c1 - c2 >= 3) || (c2 - c1 >= 3);
    }
}