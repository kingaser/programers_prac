import java.util.Arrays;
class Solution {
    public int solution(int[] s) {
        int res = 0;
        for (int i = 0; i < s.length-1; i++) {
            for (int j = i+1; j < s.length; j++)
                res = Math.max(res, s[i]*s[j]);
        }
        return res;
    }
}