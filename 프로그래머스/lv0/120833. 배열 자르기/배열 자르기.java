import java.util.Arrays;
class Solution {
    public int[] solution(int[] s, int n, int m) {
        return Arrays.copyOfRange(s, n, m+1);
    }
}