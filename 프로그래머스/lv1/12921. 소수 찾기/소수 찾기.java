class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        int[] tmp = new int[n+1];
        for (int i = 0; i <= n; i++) {
            tmp[i] = i;
        }
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0 && tmp[i] % i == 0) {
                ch[i] = 1;
                answer++;
                for (int j = i; j < ch.length; j += i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}