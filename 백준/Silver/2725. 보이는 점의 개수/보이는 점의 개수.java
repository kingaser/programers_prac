import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[1] = 3;
        for (int i = 2; i < 1001; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (gcd(i, j) == 1) {
                    cnt += 2;
                }
            }
            dp[i] = dp[i - 1] + cnt;
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int tmp = x;
            x = y;
            y = tmp % y;
        }

        return x;
    }
}