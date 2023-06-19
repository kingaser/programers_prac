import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

class Main {
    static Stack<Integer> stack = new Stack<>();
    public int solution(String s) {
        int answer = 0;
        switch (s) {
            case "pop":
                answer = stack.isEmpty() ? -1 : stack.pop();
                break;
            case "size":
                answer = stack.size();
                break;
            case "empty":
                answer = stack.isEmpty() ? 1 : 0;
                break;
            case "top":
                answer = stack.isEmpty() ? -1 : stack.peek();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String tmp = st.nextToken();
            if (tmp.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else {
                System.out.println(T.solution(s));
            }
        }
    }
}