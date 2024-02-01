import java.io.*;
import java.util.StringTokenizer;

class Main {

    static int R, C, res;
    static int[] nx = {-1, 0, 1, 0};
    static int[] ny = {0, 1, 0, -1};
    static int[][] arr;
    static boolean[] ch = new boolean[26];

    public static void DFS(int x, int y, int cnt) {
        res = Math.max(res, cnt);

        ch[arr[x][y]] = true;

        for (int i = 0; i < 4; i++) {
            int dx = x + nx[i];
            int dy = y + ny[i];

            if (0 <= dx && dx < R && 0 <= dy && dy < C && !ch[arr[dx][dy]]) {
                DFS(dx, dy, cnt + 1);
                ch[arr[dx][dy]] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[R][C];

        for (int i = 0; i < R; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = tmp.charAt(j) - 'A';
            }
        }

        DFS(0, 0, 1);

        System.out.println(res);
    }
}