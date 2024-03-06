import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[] state = new boolean[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            state[i] = !st.nextToken().equals("0");
        }

        int m = Integer.parseInt(br.readLine());
        for (int t = 0; t < m; t++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (sex == 1) {
                for (int i = num; i < n + 1; i += num) {
                    state[i] = !state[i];
                }
            } else if (sex == 2) {
                int range = 0;
                for (int i = 1; num + i < n + 1 && num - i > 0; i++) {
                    if (state[num + i] == state[num - i]) range++;
                    else break;
                }
                for (int i = num - range; i <= num + range; i++) {
                    state[i] = !state[i];
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            sb.append(state[i] ? 1 : 0).append(" ");
            if (i % 20 == 0) sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}