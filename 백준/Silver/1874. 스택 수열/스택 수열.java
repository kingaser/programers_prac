import java.io.*;
import java.util.*;

class Main {
    static int n;
    public String solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        while (j < n) {
            if (!st.empty() && st.peek() == arr[j]) {
                st.pop();
                sb.append("-\n");
                j++;
            } else {
                if (!st.empty() && i + 1 >= n && st.peek() > arr[j])
                    return "NO";
                st.push(i + 1);
                sb.append("+\n");
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(T.solution(arr));
        bw.flush();
        bw.close();
    }
}