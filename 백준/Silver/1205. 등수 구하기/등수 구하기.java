import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n, point, p;
    static int[] arr;
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        point = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(1);
            return;
        }

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int rank = 1;

        if (n == p && point == arr[n - 1]) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] <= point) {
                rank = i + 1;
                break;
            } else {
                rank++;
            }
        }

        if (rank <= p) {
            System.out.println(rank);
        } else {
            System.out.println(-1);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}