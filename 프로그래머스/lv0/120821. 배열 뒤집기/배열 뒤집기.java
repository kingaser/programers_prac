class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        for (int i = 0; i < len/2; i++) {
            int tmp = num_list[i];
            num_list[i] = num_list[len-i-1];
            num_list[len-i-1] = tmp;
        }
        for (int i = 0; i < len; i++) answer[i] = num_list[i];
        return answer;
    }
}