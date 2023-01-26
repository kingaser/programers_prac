class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int f = 0, s = 0;
        for (String str : polynomial.split(" ")) {
            if (str.contains("x")) f += str.equals("x") ? 1 : Integer.valueOf(str.substring(0, str.length()-1));
            else if (!(str.equals("+"))) s += Integer.valueOf(str);
        }
        
        String fStr = f > 0 ? f == 1 ? "x" : f + "x" : "";
        String sStr = s > 0 ? String.valueOf(s) : "";
        
        if (f > 0) {
            if (s > 0) answer += fStr + " + " + sStr;
            else answer += fStr;
        } else if(s > 0) answer += sStr;
        return answer;
    }
}