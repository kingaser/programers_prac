import java.io.*;
import java.util.*;

class Main {
    private static void solvedAc(int n, int[] arr) {
        int st = (int) (Math.round(n * 0.15));
        int ed = n - st;

        int cnt = n - (st * 2);
        int sum = 0;
        for (int i = st; i < ed; i++) {
            sum += arr[i];
        }
        System.out.println((int) (Math.round(sum / (double) cnt)));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        solvedAc(n, arr);
    }
}