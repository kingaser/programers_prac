import java.util.*;
import java.io.*;

class Main {
    static int n, m, cnt, res;
    static int[][] arr;
    static boolean[][] visit;
    static int[] nx = {-1, 0, 1, 0};
    static int[] ny = {0, 1, 0, -1};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];

        Queue<Coordinate> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int vol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 || visit[i][j]) {
                    continue;
                }
                cnt++;
                q.offer(new Coordinate(i, j));
                visit[i][j] = true;
                vol = 0;
                while (!q.isEmpty()) {
                    Coordinate tmp = q.poll();
                    vol++;
                    for (int k = 0; k < 4; k++) {
                        int x = tmp.x + nx[k];
                        int y = tmp.y + ny[k];

                        if (x < 0 || x >= n || y < 0 || y >= m) {
                            continue;
                        }

                        if (arr[x][y] == 1 && !visit[x][y]) {
                            q.offer(new Coordinate(x, y));
                            visit[x][y] = true;
                        }
                    }

                }
                res = Math.max(res, vol);
            }
        }

        bw.write(cnt + "\n" + res);
        bw.flush();
        bw.close();
    }
}

class Coordinate {
    int x = 0;
    int y = 0;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}