class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;
        
        int[] answer = {numer1 + numer2, denom1*denom2};
        
        int gcdNum = gcd(answer[0], answer[1]);
        answer[0] /= gcdNum;
        answer[1] /= gcdNum;
        
        return answer;
    }
    
    public int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        } else {
            return gcd(num2, num1 % num2);
        }
    }
}