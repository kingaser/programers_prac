import java.io.*;
import java.util.Stack;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (!st.isEmpty() && tmp == 0) {
                st.pop();
                continue;
            }
            st.add(tmp);
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}