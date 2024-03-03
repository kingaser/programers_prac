import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long res = n;
        for (int i = 0; i < n; i++) {
            arr[i] -= b;
            if (arr[i] <= 0) {
                continue;
            }
            else {
                res += arr[i] / c;
                if (arr[i] % c != 0) res++;
            }
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}