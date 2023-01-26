class Solution {
    public int solution(int[] array) {
        int answer = 0, max = 0;
        int[] tmp = new int[1001];

        for (int i = 0; i < array.length; i++) {
            tmp[array[i]]++;

            if(tmp[array[i]] > max) {
                max = tmp[array[i]];
                answer = array[i];
            }
        }
        int cnt = 0;
        for (int i = 0; i < 1001; i++) {
            if(max == tmp[i]) cnt++;
            if(cnt > 1) return -1;
        }
        return answer;
    }
}