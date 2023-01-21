class Solution {
    public int solution(String s) {
        String[] tmp = s.split(" ");
        int res = 0;
        for(int i = 0; i < tmp.length; i++) {
            if (!(tmp[i].equals("Z"))) res += Integer.parseInt(tmp[i]);
            if (i-1 >= 0) {
                if (tmp[i].equals("Z")) {
                    res -= Integer.parseInt(tmp[i-1]);
                }
            }
        }
        return res;
    }
}