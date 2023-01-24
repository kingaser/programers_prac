import java.util.Arrays;
class Solution {
    public int solution(int[] s) {
        int res = 0;
        Arrays.sort(s);
        res = s[s.length-1]*s[s.length-2];
        return res;
    }
}