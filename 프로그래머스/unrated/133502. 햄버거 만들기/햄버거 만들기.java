import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for (int x : ingredient) {
            st.push(x);
            if (st.size() >= 4 &&
               st.get(st.size() - 4) == 1 &&
               st.get(st.size() - 3) == 2 &&
               st.get(st.size() - 2) == 3 &&
               st.get(st.size() - 1) == 1) {
                for (int i = 0; i < 4; i++) {
                    st.pop();
                }
                answer++;
            }
        }
        
        return answer;
    }
}