class Solution {
    public String solution(String bin1, String bin2) {
        int a = Integer.valueOf(bin1, 2);
        int b = Integer.valueOf(bin2, 2);
        return Integer.toBinaryString(a+b);
    }
}