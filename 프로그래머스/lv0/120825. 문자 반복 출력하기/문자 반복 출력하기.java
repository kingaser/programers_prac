class Solution {
    public String solution(String str, int n) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for(int j = 0; j < n; j++) {
                res += str.charAt(i);
            }
        }
        return res;
    }
}