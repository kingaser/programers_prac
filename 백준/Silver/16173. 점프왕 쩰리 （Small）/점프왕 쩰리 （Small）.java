import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    static int n;
    static int[][] board;
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    private static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        boolean[][] visit = new boolean[n][n];
        visit[x][y] = true;
        boolean flag = false;
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            visit[pos[0]][pos[1]] = true;
            for (int i = 0; i < 2; i++) {
                if (board[pos[0]][pos[1]] != -1) {
                    int nx = pos[0] + (dx[i] * board[pos[0]][pos[1]]);
                    int ny = pos[1] + (dy[i] * board[pos[0]][pos[1]]);
                    if (nx < n && ny < n && !visit[nx][ny]) {
                        q.offer(new int[]{nx, ny});
                        if (board[nx][ny] == -1) {
                            flag = true;
                        }
                    }
                }
            }
            if (flag) break;
        }
        if (flag) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS(0, 0);
    }
}