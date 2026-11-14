class Solution {
    public int minOperations(String s) {
        int ss = 0 ;
        int ns = 0;
        char ini = s.charAt(0);
        char opp = ini == '1' ? '0':'1'; 
      
        for(int i = 0 ; i < s.length();i++)
        {
            if(i%2 == 0)
            {
                if (s.charAt(i) == ini)
                    ss++;
                else
                    ns++;
            }
            else{
                if (s.charAt(i) == opp)
                    ss++;
                else
                    ns++;

            }
        }
        return Math.min(ss,ns);
    }
}