import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            
            arr[i] = Integer.parseInt(st.nextToken());
            
            if (i >= x) {
                dp[i] = dp[i - 1] + arr[i] - arr[i - x];
            } else {
                dp[i] = dp[i - 1] + arr[i];
            }
            
            if (dp[i] > max) {
                max = dp[i];
                cnt = 1;
            } else if (dp[i] == max) {
                cnt++;
            }
        }
        
        if (max == 0) bw.write("SAD\n");
        else bw.write(max + "\n" + cnt);
        bw.flush();
        bw.close();
    }
}