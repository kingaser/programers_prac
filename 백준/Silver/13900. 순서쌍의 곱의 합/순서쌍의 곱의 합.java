import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        long[] dp = new long[n + 1];
        long res = 0;

        for (int i = 1; i < n; i++) {
            dp[i] += dp[i - 1] + Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            res += (dp[n - 1] - dp[i]) * Integer.parseInt(arr[i]);
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}