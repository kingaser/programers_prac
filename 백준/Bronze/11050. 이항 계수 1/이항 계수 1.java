import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int k = Integer.parseInt(strArr[1]);

        int[][] board = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            board[i][i] = 1;
            board[i][0] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
            }
        }

        bw.write(board[n][k] + "");
        bw.flush();
        bw.close();
    }
}