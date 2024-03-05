import java.io.*;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] student = new int[101][3];

        int nationCnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int nation = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());

            nationCnt = Math.max(nationCnt, nation);
            student[i][0] = nation;
            student[i][1] = num;
            student[i][2] = point;
        }

        Arrays.sort(student, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        int[] medalCnt = new int[nationCnt + 1];
        int[][] res = new int[3][2];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                res[cnt][0] = student[i][0];
                res[cnt][1] = student[i][1];
                medalCnt[res[i][0]]++;
                cnt++;
            } else if (medalCnt[student[i][0]] >= 2) {
                continue;
            } else {
                res[cnt][0] = student[i][0];
                res[cnt][1] = student[i][1];
                break;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}