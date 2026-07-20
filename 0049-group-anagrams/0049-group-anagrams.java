class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            int cnt[] = new int[26];
            for(char ch : s.toCharArray()){
                cnt[ch - 'a']++;
            }
            String key = Arrays.toString(cnt);
            if(res.containsKey(key)){
                res.get(key).add(s);
            }else{
                res.put(key,new ArrayList<String>());
                res.get(key).add(s);
            }
        }
        List<List<String>> ans = new ArrayList<>(res.values());
        return ans;
    }
}