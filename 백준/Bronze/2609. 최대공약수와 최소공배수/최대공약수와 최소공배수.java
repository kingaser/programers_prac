import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");

        int[] arr = new int[2];
        arr[0] = Integer.parseInt(s[0]);
        arr[1] = Integer.parseInt(s[1]);

        Arrays.sort(arr);
        sb.append(gcd(arr[0], arr[1])).append("\n");
        sb.append(lcm(arr[0], arr[1])).append("\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static int gcd(int n, int m) {
        while (m % n != 0) {
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return n;
    }

    public static int lcm(int n, int m) {
        int a = n, b = m;
        int nPos = 2;
        int mPos = 2;
        while (a != b) {
            if (a > b) b = m * mPos++;
            else a = n * nPos++;
        }

        return a;
    }
}