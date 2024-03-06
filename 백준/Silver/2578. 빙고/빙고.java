import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] board = new int[5][5];
        boolean[][] ch = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] call = new int[25];
        int idx = 0;
        while (idx != 25) {
            String[] s = br.readLine().split(" ");
            call[idx++] = Integer.parseInt(s[0]);
            call[idx++] = Integer.parseInt(s[1]);
            call[idx++] = Integer.parseInt(s[2]);
            call[idx++] = Integer.parseInt(s[3]);
            call[idx++] = Integer.parseInt(s[4]);
        }

        for (int i = 0; i <25; i++) {
            int cnt = 0;
            boolean flag = false;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (call[i] == board[j][k]) {
                        ch[j][k] = true;
                        flag = true;
                    }
                }
                if (flag) break;
            }
            /*
            11 12 2 24 10
            16 1 13 3 25
            6 20 5 21 17
            19 4 8 14 9
            22 15 7 23 18
             */
            for (int j = 0; j < 5; j++) {
                flag = false;
                for (int k = 0; k < 5; k++) {
                    if (!ch[j][k]) flag = true;
                    if (flag) break;
                }
                if (!flag) cnt++;
                flag = false;
                for (int k = 0; k < 5; k++) {
                    if (!ch[k][j]) flag = true;
                    if (flag) break;
                }
                if (!flag) cnt++;
            }

            flag = false;
            for (int j = 0; j < 5; j++) {
                if (!ch[j][j]) flag = true;
                if (flag) break;
            }
            if (!flag) cnt++;
            flag = false;
            for (int j = 0; j < 5; j++) {
                if (!ch[j][5 - j - 1]) flag = true;
                if (flag) break;
            }
            if (!flag) cnt++;
            if (cnt >= 3) {
                System.out.println(i + 1);
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
