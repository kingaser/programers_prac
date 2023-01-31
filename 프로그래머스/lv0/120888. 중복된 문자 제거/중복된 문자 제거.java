class Solution {
    public String solution(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == i) res+=s.charAt(i);
        }
        return res;
    }
}