class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] arr = new int[n + 1];
        
        for (int i = 0; i < section.length; i++) {
            arr[section[i]] = 1;
        }
        
        for (int i = 1; i < n + 1; i++) {
            if (arr[i] == 1) {
                i += m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}