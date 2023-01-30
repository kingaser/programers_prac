class Solution {
    public int solution(int order) {
        int answer = 0;
            String tmp = "" + order;
            for (char x : tmp.toCharArray()) {
                if (x == '3' || x == '6' || x == '9') answer++;
            }
        return answer;
    }
}