import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n, l;
    static int D, R, G, pos = 0;
    static int time = 0;

    private static void solution() {
        int gap = 0;

        time += D - pos;
        pos = D;

        gap = time % (R + G);
        if (gap < R) time += R - gap;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            D = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            G = Integer.parseInt(st.nextToken());
            solution();
        }

        time += l - pos;
        System.out.println(time);
    }
}