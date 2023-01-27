import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (String s : completion) {
            map.put(s, map.get(s)-1);
        }
        for (Map.Entry<String, Integer> tmpMap : map.entrySet()) {
            if (tmpMap.getValue().equals(1)) {
                answer = tmpMap.getKey();
            }
        }
        return answer;
    }
}