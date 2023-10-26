import java.util.Scanner;

class Main {

    static int n;
    static int m;

    public static void dfs(int x, int y, char[][] board, char state) {
        if (x < n && y < m && board[x][y] == '-' && state == '-') {
            dfs(x, y + 1, board, state);
            board[x][y] = '0';
        } else if (x < n && y < m && board[x][y] == '|' && state == '|') {
            dfs(x + 1, y, board, state);
            board[x][y] = '0';
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String tmp = kb.next();
            board[i] = tmp.toCharArray();
        }

        int cnt= 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '-' || board[i][j] == '|') {
                    cnt++;
                    dfs(i, j, board, board[i][j]);
                }
            }
        }
        System.out.println(cnt);
    }
}