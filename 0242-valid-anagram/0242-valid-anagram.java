class Solution {
    public boolean isAnagram(String s, String t) {
        List <Character> lst = new ArrayList<>();
        if(s.length() != t.length())
            return false;
        for(Character ch : s.toCharArray()){
            lst.add(ch);
        }
        for(Character ch : t.toCharArray()){
            if(lst.contains(ch)){
                lst.remove(ch);
            }else{
                return false;
            }
        }
        return true;
    }
}