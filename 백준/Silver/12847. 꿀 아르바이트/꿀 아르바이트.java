import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] pay = new long[n];
        long sum = 0;
        long max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pay[i] = Integer.parseInt(st.nextToken());
            if (i - m >= 0) sum -= pay[i - m];
            sum += pay[i];
            max = Math.max(max, sum);
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}