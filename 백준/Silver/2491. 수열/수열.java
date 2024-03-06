import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int prev = 0;
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= prev) {
                prev = arr[i];
                cnt++;
            } else {
                prev = arr[i];
                cnt = 1;
            }
            max = Math.max(cnt, max);
        }

        prev = 0;
        cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= prev) {
                prev = arr[i];
                cnt++;
            } else {
                prev = arr[i];
                cnt = 1;
            }
            max = Math.max(cnt, max);
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}