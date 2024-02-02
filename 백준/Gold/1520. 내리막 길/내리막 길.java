import java.util.*;

class Main {
    static int n, m;
    static int[][] arr, ch;
    static int[] nx = {-1, 0, 1, 0};
    static int[] ny = {0, 1, 0, -1};

    public static int DFS(int x, int y) {
        if (x == n - 1 && y == m - 1) return 1;
        if (ch[x][y] != -1) return ch[x][y];
        else {
            ch[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                int dx = x + nx[i];
                int dy = y + ny[i];

                if (dx < 0 || dx >= n || dy < 0 || dy >= m) {
                    continue;
                }

                if (arr[x][y] > arr[dx][dy]) {
                    ch[x][y] += DFS(dx, dy);
                }
            }
        }

        return ch[x][y];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        arr = new int[n][m];
        ch = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = kb.nextInt();
                ch[i][j] = -1;
            }
        }

        System.out.println(DFS(0, 0));
    }
}