import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp > 0) {
                if (tmp % 10 == m) cnt++;
                tmp /= 10;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}