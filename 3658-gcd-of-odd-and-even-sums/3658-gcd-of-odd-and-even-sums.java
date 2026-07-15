class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);

        int rem = sumEven % sumOdd;
        
        while(rem > 0){
            sumEven = sumOdd;
            sumOdd = rem;
            rem = sumEven % sumOdd;
            
        }
        return sumOdd;
    }
}