import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] tmp = new int[n+1];
        Arrays.fill(tmp, 1);
        for (int i : lost) tmp[i]--;
        for (int i : reserve) tmp[i]++;
        for (int i = 1; i <= n; i++) {
            if (tmp[i] == 2) {
                if (i != 0 && tmp[i-1] == 0) tmp[i-1]++;
                else if (i != n && tmp[i+1] == 0) tmp[i+1]++;
            }
        }
        int answer = n;
        for (int i = 1; i <= n; i++) {
            if (tmp[i] == 0) answer--;
        }
        return answer;
    }
}