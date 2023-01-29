class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 7, fail = 0;
        for (int a : lottos) {
            if (a == 0) fail++;
            for (int b : win_nums) {
                if (a == b) win--;
            }
        }
        answer[0] = (win == 7 && fail == 6) || win != 7 ? win - fail : 6;
        answer[1] = win == 7 ? 6 : win;
        
        return answer;
    }
}