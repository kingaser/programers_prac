import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int[][] pos;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    private static void solution() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if (x < 1 || x > 101 || y < 1 || y > 101) sum++;
                        else if (1 <= x && x <= 100 && 1 <= y && y <= 100 && board[x][y] == 0) sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }

    private static void paper(int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                board[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        pos = new int[n][2];
        board = new int[101][101];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            paper(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        solution();
    }
}