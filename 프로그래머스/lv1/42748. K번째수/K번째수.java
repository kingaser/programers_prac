import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0, j = 0, k = 0;
        for (int s = 0; s < commands.length; s++) {
            i = commands[s][0];
            j = commands[s][1];
            k = commands[s][2];
            int[] a = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(a);
            answer[s] = a[k-1];
        }
        return answer;
    }
}