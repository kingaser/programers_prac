class Solution {
    public int solution(int[] a, int k) {
        int res = 0, pos = 0, cnt = 1;
        while(true) {
            pos += 2;
            cnt++;
            if(pos > a.length-1) pos -= (a.length);
            if(cnt == k) {
                res = pos-2;
                break;
            }
        }
        return res;
    }
}