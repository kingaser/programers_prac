import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder(new String(str));
        return sb.reverse().toString();
    }
}