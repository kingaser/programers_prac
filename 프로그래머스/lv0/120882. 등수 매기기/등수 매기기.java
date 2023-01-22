class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] tmp = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                tmp[i] += score[i][j];
            }
        }
        for(int i = 0; i < score.length; i++) {
            int cnt = 1;
            for(int j = 0; j < score.length; j++) {
                if (tmp[i] < tmp[j]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}