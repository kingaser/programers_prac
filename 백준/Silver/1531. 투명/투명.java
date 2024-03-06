import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[101][101];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    board[j][k]++;
                }
            }
        }
        
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (board[i][j] > m) cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}