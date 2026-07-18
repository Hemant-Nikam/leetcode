class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        if(s.length() == 0)
            return true;
        while(i <= j && j > 0 && i < s.length()){
            System.out.println("i , j : "+ i +" "+j );
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)) ){
                if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j)) ){
                    if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                        return false;
                } 
                else if(s.charAt(i) != s.charAt(j))
                    return false;
                
                i++;
                j--;
            }
            else if (!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
                
            System.out.println("i , j :: "+ i +" "+j );
        }
        return true;

    }
}