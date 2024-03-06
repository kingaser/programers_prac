import java.io.*;
import java.util.StringTokenizer;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] books = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            books[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        int weight = 0;
        for (int i = 0; i < n; i++) {
            if (weight + books[i] > m) {
                weight = books[i];
                cnt++;
            } else {
                weight += books[i];
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}