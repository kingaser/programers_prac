class Solution {
    public int solution(int chicken) {
        int answer = 0;
        final int cp = 10;
        while(chicken >= cp) {
            int bonusCh = chicken / cp;
            int tmp = chicken % cp;
            chicken = bonusCh + tmp;
            answer+=bonusCh;
        }
        return answer;
    }
}