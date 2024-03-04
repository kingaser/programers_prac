import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] person = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            person[i][0] = Integer.parseInt(s[0]);
            person[i][1] = Integer.parseInt(s[1]);
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}