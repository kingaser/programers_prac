import java.io.*;
import java.util.*;

class Main {
    static int n, m;

    public int solution(int[] arr) {
        int st = 0, pos = 0, sum = 0, cnt = 0;
        while (pos < n) {
            if (sum + arr[pos] == m) {
                sum += arr[pos++];
                cnt++;
            } else if (sum + arr[pos] < m) {
                sum += arr[pos++];
            } else {
                sum -= arr[st++];
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(T.solution(arr) + "");
        bw.flush();
        bw.close();
    }
}