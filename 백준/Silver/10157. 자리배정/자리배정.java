import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n, m, k;
    static int[] nx = {1, 0, -1, 0};
    static int[] ny = {0, 1, 0, -1};
    private static void solution() {
        if (k > n * m) {
            System.out.println(0);
            return;
        }
        int[][] arr = new int[m + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            arr[0][i] = -1;
            arr[m + 1][i] = -1;
        }
        for (int i = 0; i < m + 2; i++) {
            arr[i][0] = -1;
            arr[i][n + 1] = -1;
        }

        int x = 1;
        int y = 1;
        int pos = 1;
        int idx = 0;
        while (true) {
            arr[x][y] = pos;
            if (pos == k) {
                System.out.println(y + " " + x);
                return;
            }

            if (arr[x + nx[idx]][y + ny[idx]] != 0) {
                idx = (idx + 1) % 4;
            }
            x = x + nx[idx];
            y = y + ny[idx];
            pos++;
            if (pos > n * m) break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        solution();
    }
}