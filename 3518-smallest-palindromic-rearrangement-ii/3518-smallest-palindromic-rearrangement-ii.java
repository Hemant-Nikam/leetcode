class Solution {
    public long ncr(int n,int r, int k){
        r = Math.min(r,n-r);
        long result = 1;
        for(int i = 1; i <= r ; i++){
            result = result * (n-r+i) / i ;
            if(result >= k)
                return result;
        }
        return result;
    }
    public String smallestPalindrome(String s, int k) {
        int cnt[] = new int[26];
        char mid = 'a';

            

        for(int i = 0 ; i < s.length() ; i ++){
            cnt[s.charAt(i) - 'a']++;
        }

        if(s.length() % 2 == 1){
            mid = s.charAt(s.length() /2);
            cnt[mid - 'a']--;
        }
            

        for(int i = 0 ; i < 26 ; i ++){
            cnt[i] /= 2;
        }
        
        StringBuilder half = new StringBuilder();

        for(int i = 0 ; i < s.length()/2 ; i++){
            boolean placed = false;
            for(int j = 0 ; j < 26 ; j++){
                if(cnt[j] > 0 ){
                    cnt[j] --;
                    //cal total ways:
                    long ways = 1;
                    int letters = 0;
                    for(int c = 0 ; c < 26;c++){
                        letters += cnt[c];
                    }
                    for(int c = 0 ; c < 26;c++){
                        if(cnt[c] > 0){
                            ways *= ncr(letters,cnt[c],k);
                            letters -= cnt[c];
                        }
                        if(ways >= k){
                            break;
                        }
                    }
                    if(ways >= k){
                        half.append((char)(j+'a'));
                        placed = true;
                        break;
                    }
                    
                    cnt[j]++;
                    k = k -(int) ways;
                }
            }
            if(!placed)
                return "";
        }
        String half1 = half.toString();
        String rev = new StringBuilder(half1).reverse().toString();
        return s.length() % 2 == 0 ? half1+rev : half1+mid+rev;
    }
}