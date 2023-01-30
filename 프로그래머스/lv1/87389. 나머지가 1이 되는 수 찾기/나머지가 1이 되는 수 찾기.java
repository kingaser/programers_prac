class Solution {
    public int solution(int n) {
        int answer = 0;
        // n을 나눌 수 반복문으로 생성
        for (int i = 1; i < n; i++) {
            // n을 i로 나눈 나머지가 1인 수 대입
            if (n%i == 1) {
                answer = i;
                // 1부터 반복하므로 첫번째 값이 가장 작은값이므로 답이 나왔을 때 break로 반복문을 빠져나가줘야한다.
                break;
            }
        }
        return answer;
    }
}