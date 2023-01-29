import java.util.ArrayList;

class Solution {
    int[] supo1 = {1, 2, 3, 4, 5};
    int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] cnt = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if (supo1[i%supo1.length] == answers[i]) cnt[0]++;
            if (supo2[i%supo2.length] == answers[i]) cnt[1]++;
            if (supo3[i%supo3.length] == answers[i]) cnt[2]++;
        }
        int max = Integer.MIN_VALUE;
        for (int x : cnt) {
            if (x > max) max = x;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (max == cnt[i]) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}