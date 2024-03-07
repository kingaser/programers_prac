import java.io.*;

class Main {
    static int n;
    static char[][] board;

    private static void solution() {
        n = n * 4 - 3;
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ' ';
            }
        }

        star(0, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static void star(int s, int len) {
        if (len <= s) return;

        for (int i = s; i < len; i++) {
            board[i][s] = '*';
            board[i][len - 1] = '*';
            board[s][i] = '*';
            board[len - 1][i] = '*';
        }

        star(s + 2, len - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        solution();
    }
}