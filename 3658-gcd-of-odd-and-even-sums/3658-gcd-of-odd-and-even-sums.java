class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);

        int rem = sumEven % sumOdd;
        return n;
        //traditional way for finding GCD:
        /*
        while(rem > 0){
            sumEven = sumOdd;
            sumOdd = rem;
            rem = sumEven % sumOdd;
            
        }
        return sumOdd;
        //In this case: GCD is always the n value "Simply n can be return";
        */
    }
}