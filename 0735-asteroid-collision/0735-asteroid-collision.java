class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        while(i < asteroids.length && asteroids[i] < 0){
            st.push(asteroids[i]);
            i++;
        }
        while(i< asteroids.length){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
                i++;
            }
            else{
                if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroids[i]);
                    i++;
                }

                else if(!st.isEmpty() && Math.abs(st.peek()) <= Math.abs(asteroids[i])){
                    int num = 0;
                    while(!st.isEmpty() && st.peek() > 0 && Math.abs(st.peek()) <= Math.abs(asteroids[i])){
                        if(Math.abs(st.peek()) == Math.abs(asteroids[i])){
                            num = st.pop();
                            break;
                        }
                        num = st.pop();
                    }
                    if((st.isEmpty() || st.peek() < 0) &&  Math.abs(num) != Math.abs(asteroids[i]) )
                        st.push(asteroids[i]);
                    i++;
                }
                    
                else if(!st.isEmpty() && Math.abs(st.peek()) > Math.abs(asteroids[i]))
                    i++;
                
            }
        }
        while(!st.isEmpty()){
            lst.add(0,st.pop());
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
    }
}