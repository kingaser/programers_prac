class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String dics : dic) {
            boolean right = true;
            for(String spells : spell) {
                if(dics.indexOf(spells) == -1) {
                    right = false;
                    break;
                }
            }
            if (right == true) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}