import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n + 1];
            int[] dp = new int[n + 1];
            int max = Integer.MIN_VALUE;
            
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                dp[j] = dp[j - 1] + arr[j];
                
                max = Math.max(max, Math.max(arr[j], dp[j]));
            }
            
            for (int j = 1; j <= n; j++) {
                for (int k = n; k > j; k--) {
                    max = Math.max(max, dp[k] - dp[j]);
                }
            }
            
            sb.append(max).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}