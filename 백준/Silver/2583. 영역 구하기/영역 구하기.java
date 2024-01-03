import java.util.*;

class Main {
    static int n, m, k, v;
    static int[][] board;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void DFS(int x, int y) {
        board[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if (0 <= xx && xx < n && 0 <= yy && yy < m && board[xx][yy] == 0) {
                v++;
                DFS(xx, yy);
            }
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        k = kb.nextInt();
        int cnt = 0;

        board = new int[n][m];

        for (int i = 0; i < k; i++) {
            int y1 = kb.nextInt();
            int x1 = kb.nextInt();
            int y2 = kb.nextInt();
            int x2 = kb.nextInt();

            for (int j = x1; j < x2; j++) {
                for (int s = y1; s < y2; s++) {
                    board[j][s] = 1;
                }
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    cnt++;
                    v = 1;
                    DFS(i, j);
                    pq.offer(v);
                }
            }
        }

        System.out.println(cnt);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}