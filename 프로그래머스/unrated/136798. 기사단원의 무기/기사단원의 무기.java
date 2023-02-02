import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] ad = new int[number];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) ad[i-1]++;
                else if(i % j == 0) ad[i-1] += 2; 
            }
        }
        for (int x : ad) {
            if (x > limit) answer += power;
            else answer += x;
        }
        return answer;
    }
}