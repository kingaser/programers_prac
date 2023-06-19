//구호 SONGDO에 대해 HIGHSCHOOL로 응원.
//구호 CODE에 대해 MASTER로 응원.
//구호 2023에 대해 0611로 응원.
//구호 ALGORITHM에 대해 CONTEST로 응원.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    String[] slogan = {"SONGDO", "CODE", "2023", "ALGORITHM"};
    String[] cheer = {"HIGHSCHOOL", "MASTER", "0611", "CONTEST"};
    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < 4; i++) {
            if (s.equals(slogan[i])) {
                answer = cheer[i];
            }
        }
        return answer;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        
        System.out.println(T.solution(br.readLine()));
    }
}