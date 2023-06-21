import java.util.*;
import java.io.*;

class Main {
    public String solution(String vps) {
        Stack<Character> vpsStack = new Stack<>();

        if (vps.charAt(0) == ')') return "NO";
        for (char c : vps.toCharArray()) {
            if (c == '(')
                vpsStack.push(c);
            else if(vpsStack.isEmpty())
                return "NO";
            else
                vpsStack.pop();
        }


        return vpsStack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String vps = br.readLine();
            bw.write(T.solution(vps) + "\n");
        }

        bw.flush();
        bw.close();
    }
}