import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n%3);
            n /= 3;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer x : list) {
            sb.append(x);
        }
        for (int i = sb.length()-1, j = 0; i >= 0; i--, j++) {
            if (i == sb.length()-1) answer = sb.charAt(i)-48;
            else {
                answer += (sb.charAt(i)-48)*(Math.pow(3, j));
            }
        }

        return answer;
    }
}