class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        if(max == 2) return 1;
        for (int i = 1; i < max+min+1; i++) {
            if(min+i > max && i <= max) answer++;
            if(min+max > i && i > max) answer++;
        }
        return answer;
    }
}