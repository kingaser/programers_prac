import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int e = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);
        int m = Integer.parseInt(str[2]);

        int a = 0, b = 0, c = 0;
        int cnt = 0;
        while (true) {
            cnt++;
            a++;
            b++;
            c++;
            if (a == 16) a = 1;
            if (b == 29) b = 1;
            if (c == 20) c = 1;

            if (a == e && b == s && c == m) break;

        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}