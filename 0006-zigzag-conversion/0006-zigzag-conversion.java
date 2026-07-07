class Solution {
    public String convert(String s, int numRows) {
        String ans= "";
        if(numRows == 1)
            return s;
        for(int r=0;r< numRows;r++){
            int inc = 2*(numRows-1);
            for(int i = r;i<s.length();i = i+inc){
                ans = ans + s.charAt(i);
                if(r>0 && r < numRows -1 && i+inc - 2*r < s.length()){
                    ans = ans +s.charAt(i+inc-2*r);
                }
            }
        }
        return ans;
    }
}