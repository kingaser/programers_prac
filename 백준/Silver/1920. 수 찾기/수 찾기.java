import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> numA = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numA.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (numA.contains(Integer.parseInt(st.nextToken())))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}