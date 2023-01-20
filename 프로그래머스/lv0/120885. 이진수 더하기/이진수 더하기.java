class Solution {
    public String solution(String bin1, String bin2) {
        long res = Long.parseLong(bin1)+Long.parseLong(bin2);
        return Long.toBinaryString(res);
    }
}