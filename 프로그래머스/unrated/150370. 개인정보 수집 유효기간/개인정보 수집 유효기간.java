import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> termMap = new HashMap<>();
        
        int date = getDate(today);
        
        for (String s : terms) {
            String[] term = s.split(" ");
            termMap.put(term[0], Integer.parseInt(term[1]) * 28);
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            
            if (getDate(privacy[0]) + termMap.get(privacy[1]) <= date) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    private int getDate(String today) {
        String[] tmp = today.split("\\.");
        
        int year = Integer.parseInt(tmp[0]) * 28 * 12;
        int month = Integer.parseInt(tmp[1]) * 28;
        int day = Integer.parseInt(tmp[2]);
        
        return year + month + day;
    }
}