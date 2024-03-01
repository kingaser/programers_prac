import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = 1;
        int len = 123456 * 2 + 1;
        long[] arr = new long[len];
        arr[1] = 1;

        for (int i = 2; i < len; i++) {
            int tmp = 1;
            for (int j = i; j < len; j += i) {
                if (arr[j] == 0) arr[j] = tmp++;
            }
        }

        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == 0) break;
            int cnt = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (arr[i] == 1) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}