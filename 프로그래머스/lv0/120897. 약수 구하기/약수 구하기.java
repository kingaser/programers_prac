import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int i=1;
        while(true) {
            if(n%i==0) {
                list.add(i);
                i++;
            } else {
                i++;
            }
            if(i > n)break;
        }
        int[] answer = new int[list.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}