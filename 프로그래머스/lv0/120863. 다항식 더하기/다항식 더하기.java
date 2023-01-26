class Solution {
    public String solution(String polynomial) {
        int xCnt = 0;
        int cnt = 0;
        for (String s : polynomial.split(" ")) {
            if(s.contains("x")) xCnt += s.equals("x") ? 1 : Integer.parseInt(s.substring(0, s.length()-1));
            else if (!(s.equals("+"))) cnt += Integer.parseInt(s);
        }
        return (xCnt > 0 ? xCnt == 1 ? "x" : xCnt + "x" : "") + 
            (cnt > 0 ? xCnt > 0 ? " + " + String.valueOf(cnt) : String.valueOf(cnt) : "");
    }
}