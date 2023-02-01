import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String dartResult) {

        int answer = 0;
        int index = 0;
        Matcher matcher = Pattern.compile("([0-9]0?)([SDT])([*#]?)").matcher(dartResult);

        ArrayList<Integer> score_list = new ArrayList<>();

        while (matcher.find()) {
            int type = matcher.group(2).equals("T") ? 3 : matcher.group(2).equals("D") ? 2 : 1;
            int option = matcher.group(3).equals("*") ? 2 : matcher.group(3).equals("#") ? -1 : 1;

            int score = (int) Math.pow(Integer.parseInt(matcher.group(1)), type) * option;
            score_list.add(index, score);

            if (index > 0 && option == 2) {
                score_list.set(index - 1, score_list.get(index-1) * option);
            }
            index++;
        }
        for (Integer sc : score_list) {
            answer += sc;
        }

        return answer;
    }
}