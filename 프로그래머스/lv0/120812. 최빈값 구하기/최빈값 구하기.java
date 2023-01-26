class Solution {
    public int solution(int[] array) {
        int answer = 0, max = 0;
        int[] ch = new int[1001];
        for(int i = 0; i < array.length; i++) {
            ch[array[i]]++;
            
            if (ch[array[i]] > max) {
                max = ch[array[i]];
                answer = array[i];
            }
        }
        
        int cnt = 0;
        for(int i = 0; i < 1001; i++) {
            if (ch[i] == max) cnt++;
            if (cnt > 1) return -1;
        }
        return answer;
    }
}