import java.util.*;
import java.io.*;

class Main {
    static int n;
    public int solution(String word) {
        Stack<Character> st = new Stack<>();
        
        for (char c : word.toCharArray()) {
            if (!st.empty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        
        if (st.empty()) {
            return 1;
        }
        
        return 0;
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n-- > 0) {
            cnt += T.solution(br.readLine());
        }
        
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}