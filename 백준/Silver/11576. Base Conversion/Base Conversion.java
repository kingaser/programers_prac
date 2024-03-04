import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int[] res = new int[20];
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sum += tmp * (int) Math.pow(a, n - i -1);
        }

        int idx = 0;
        while (sum > 0) {
            res[idx++] = sum % b;
            sum /= b;
        }

        boolean flag = false;
        for (int i = 19; i >= 0; i--) {
            if (res[i] != 0) flag = true;
            if (flag) System.out.print(res[i] + " ");
        }
    }
}