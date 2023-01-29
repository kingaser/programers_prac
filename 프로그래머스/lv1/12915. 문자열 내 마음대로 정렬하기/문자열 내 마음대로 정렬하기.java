import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list1 = new ArrayList<>(Arrays.asList(strings));
        List<String> list2 = new ArrayList<>();
        Collections.sort(list1);
        int len = list1.size();
        String[] answer = new String[len];
        for (String s : list1) {
            list2.add(s.substring(n, n+1));
        }
        Collections.sort(list2);
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < list1.size(); j++) {
                if(list1.get(j).substring(n, n+1).equals(list2.get(i))) {
                    answer[i] = list1.get(j);
                    list1.remove(list1.get(j));
                    break;
                }
            }
        }

        return answer;
    }
}