import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] a = new int[9];
        int[] b = new int[10];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < 10; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int aCnt = 0;
        int bCnt = 0;
        for (int i = 0; i < 9; i++) {
            aCnt += a[i];
            bCnt += b[i];
            if (aCnt > bCnt) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}