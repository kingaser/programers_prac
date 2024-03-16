import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static char[][] windows;

    private static void solution() {
        int[] res = new int[5];
        for (int i = 1; i < 5 * m; i += 5) {
            int cnt = 0;
            if (i % 5 == 0) continue;
            for (int j = 1; j < 5 * n + 1; j++) {
                if (j % 5 == 0) {
                    res[cnt]++;
                    cnt = 0;
                } else {
                    if (windows[j][i] == '*') {
                        cnt++;
                    }
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            windows = new char[5 * n + 1][5 * m + 1];
            for (int i = 0; i < 5 * n + 1; i++) {
                windows[i] = br.readLine().toCharArray();
            }

            solution();

        } catch (IOException e) {
            System.out.println("입출력 오류");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}