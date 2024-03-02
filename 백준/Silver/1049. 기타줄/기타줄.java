import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] pack = new int[m];
        int[] piece = new int[m];
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            pack[i] = Integer.parseInt(st.nextToken());
            piece[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(pack);
        Arrays.sort(piece);

        res = Math.min(pack[0] * (n / 6 + 1), piece[0] * n);
        res = Math.min(pack[0] * (n / 6) + piece[0] * (n % 6), res);
        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}