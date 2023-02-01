class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;
        for (char x : s.toCharArray()) {
            if (x == 'p') cnt++;
            else if(x == 'y') cnt--;
        }
        return cnt == 0;
    }
}