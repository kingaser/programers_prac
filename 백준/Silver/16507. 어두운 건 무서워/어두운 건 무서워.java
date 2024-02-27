import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] picture = new int[r + 1][c + 1];

        for (int i = 1; i <= r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= c; j++) {
                picture[i][j] = picture[i - 1][j] + picture[i][j - 1] - picture[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = picture[x2][y2] - picture[x2][y1 - 1] - picture[x1 - 1][y2] + picture[x1 - 1][y1 - 1];
            int v = (x2 - (x1 - 1)) * (y2 - (y1 - 1));

            sb.append(sum / v).append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}