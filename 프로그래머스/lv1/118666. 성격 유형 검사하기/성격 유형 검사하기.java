import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] point = {3, 2, 1, 0, -1, -2, -3};

        HashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            map.put(survey[i].substring(0, 1), map.get(survey[i].substring(0, 1)) + point[choices[i] - 1]);
        }
        System.out.println(map.keySet() + " " + map.values());
        
        StringBuilder answer = new StringBuilder();
        
        answer.append(map.get("R") >= map.get("T") ? "R" : "T");
        answer.append(map.get("C") >= map.get("F") ? "C" : "F");
        answer.append(map.get("J") >= map.get("M") ? "J" : "M");
        answer.append(map.get("A") >= map.get("N") ? "A" : "N");
        
        return answer.toString();
    }
}