import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[20];
            int n = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for (int j = 0; j < 19; j++) {
                for (int k = j + 1; k < 20; k++) {
                    if (arr[j] > arr[k]) {
                        int tmp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = tmp;
                        cnt++;
                    }
                }
            }
            System.out.println(n + " " + cnt);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}