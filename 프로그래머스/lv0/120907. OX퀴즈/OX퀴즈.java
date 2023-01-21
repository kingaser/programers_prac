class Solution {
    public String[] solution(String[] q) {
        String[] res = new String[q.length];
        String[] tmp = new String[0];
        for(int i = 0; i < q.length; i++) {
            tmp = q[i].split(" ");
            if (tmp[1].equals("+")) {
                if((Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2])) == Integer.parseInt(tmp[4])) res[i] = "O";
                else res[i] = "X";
            } else {
                if((Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2])) == Integer.parseInt(tmp[4])) res[i] = "O";
                else res[i] = "X";
            }
        }
        return res;
    }
}