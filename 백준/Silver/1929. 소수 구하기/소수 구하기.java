import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");

        int[] arr = new int[1000001];

        for (int i = 2; i < 1000001; i++) {
            int tmp = 1;
            for (int j = i; j < 1000001; j += i) {
                if (arr[j] == 0)  arr[j] = tmp++;
            }
        }

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        for (int i = n; i <= m; i++) {
            if (arr[i] == 1) sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}