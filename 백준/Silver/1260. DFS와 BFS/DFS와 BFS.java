import java.util.Scanner;
import java.util.*;

public class Main {

    static int n, m, v;
    static int[][] Dboard;
    static int[][] Bboard;

    public static void DFS(int L, int v, int[] ch) {
        ch[v] = 1;

        if (L == n) return;
        else {
            for (int i = 1; i < n + 1; i++) {
                if (Dboard[v][i] == 1 && ch[i] == 0) {
                    Dboard[v][i] = 0;
                    Dboard[i][v] = 0;
                    System.out.print(i + " ");
                    DFS(L + 1, i, ch);
                }
            }
        }
    }

    public static String BFS(int v, int[] ch) {
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        ch[v] = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int tmp = q.poll();
                sb.append(tmp).append(" ");
                for (int j = 1; j < n + 1; j++) {
                    if (Bboard[tmp][j] == 1 && ch[j] == 1) {
                        Bboard[tmp][j] = 0;
                        Bboard[j][tmp] = 0;
                        ch[j] = 0;
                        q.offer(j);
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        v = kb.nextInt();

        Dboard = new int[n + 1][n + 1];
        Bboard = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            Dboard[x][y] = 1;
            Dboard[y][x] = 1;
            Bboard[x][y] = 1;
            Bboard[y][x] = 1;
        }
        int[] ch = new int[n + 1];

        System.out.print(v + " ");
        DFS(1, v, ch);
        System.out.println();
        System.out.println(BFS(v, ch));
    }
}