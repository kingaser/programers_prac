import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public long solution(long n) {
        List<Character> list = new ArrayList<>();
        String tmp = "" + n;
        for (char x : tmp.toCharArray()) {
            list.add(x);
        }
        Collections.sort(list, Collections.reverseOrder());
        String s = list.toString();
        String ss = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) ss += c;
        }

        return Long.parseLong(ss);
    }
}