class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean sign = false;
        for(int i = 0; i < db.length; i++) {
            if(!(id_pw[0].equals(db[i][0]))) {
                answer = "fail";
            } else {
                sign = true;
            }
            if(sign) {
                if(id_pw[1].equals(db[i][1])) return "login";
                else return "wrong pw";
            }
        }
        return answer;
    }
}