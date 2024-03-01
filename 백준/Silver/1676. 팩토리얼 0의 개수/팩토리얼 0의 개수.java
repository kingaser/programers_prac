import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}