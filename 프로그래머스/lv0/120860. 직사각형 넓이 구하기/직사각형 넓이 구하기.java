class Solution {
    public int solution(int[][] dots) {
        int answer = 0, x = 0, y = 0;
        for(int i = 0; i < dots.length-1; i++) {
            if(!(dots[i][0] - dots[i+1][0] == 0)) x = Math.abs(dots[i][0] - dots[i+1][0]);
            if(!(dots[i][1] - dots[i+1][1] == 0)) y = Math.abs(dots[i][1] - dots[i+1][1]);
        }
        answer = x*y;
        return answer;
    }
}