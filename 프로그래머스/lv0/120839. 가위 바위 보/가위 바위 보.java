class Solution {
    public String solution(String str) {
        String res = "";
        int i = 0;
        while (i < str.length()) {
            switch (str.charAt(i++)) {
            case '0':
                res += "5";
                break;
            case '2':
                res += "0";
                break;
            case '5':
                res += "2";
                break;
            }
        }
        
        return res;
    }

}