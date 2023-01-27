class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int cn = numer1 * denom2 + numer2 * denom1;
        int pn = denom1 * denom2;
        
        for (int i = cn-1; i > 1; i--) {
            if (cn % i == 0 && pn % i == 0) {
                cn /= i;
                pn /=i;
            }
        }
        int[] answer = {cn, pn};
        return answer;
    }
}