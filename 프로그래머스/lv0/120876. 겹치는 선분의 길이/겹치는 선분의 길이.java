import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        for (Integer x : map.keySet()) {
            if (map.get(x) > 1) answer++;
        }
        return answer;
    }
}