import java.util.*;
import java.io.*;

class Main {
    static int n, m;

    public int solution(int[] arr) {
        int sum = 0, st = 0, ed = m;

        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        int max = sum;

        while (ed < n) {
            sum += arr[ed++] - arr[st++];
            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(T.solution(arr) + "");
        bw.flush();
        bw.close();
    }
}