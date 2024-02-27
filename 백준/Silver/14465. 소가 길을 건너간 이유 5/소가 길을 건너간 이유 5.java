import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] lights = new int[n + 1];

        for (int i = 0; i < b; i++) {
            int idx = Integer.parseInt(br.readLine());
            lights[idx] = 1;
        }

        for (int i = 1; i <= n; i++) {
            lights[i] = lights[i] + lights[i - 1];
        }

        int res = Integer.MAX_VALUE;
        for (int i = k; i <= n; i++) {
            res = Math.min(res, lights[i] - lights[i - k]);
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}