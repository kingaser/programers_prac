import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = 64;
        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (x > 0) {
            if (len > x) {
                len /= 2;
            } else {
                x -= len;
                cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}
