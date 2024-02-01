import java.io.*;

public class Main {

    static int n;
    static char[][] board;
    static boolean[][] ch;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void DFS(int x, int y) {
        ch[x][y] = true;
        char color = board[x][y];

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < n && board[nx][ny] == color && !ch[nx][ny]) {
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();

            for (int j = 0; j < tmp.length(); j++) {
                board[i][j] = tmp.charAt(j);
            }
        }

        ch = new boolean[n][n];
        int normalCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!ch[i][j]) {
                    DFS(i, j);
                    normalCnt++;
                }
            }
        }

        int unNormalCnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'G') {
                    board[i][j] = 'R';
                }
            }
        }

        ch = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!ch[i][j]) {
                    DFS(i, j);
                    unNormalCnt++;
                }
            }
        }

        System.out.println(normalCnt + " " + unNormalCnt);
    }
}
