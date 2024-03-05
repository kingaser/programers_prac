import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] arr = new int[n];

        int T = Integer.parseInt(br.readLine());
        int res = 0;
        int lt = 1;
        int rt = m;

        for (int i = 0; i < T; i++) {
            int pos = Integer.parseInt(br.readLine());

            if (lt <= pos && pos <= rt) continue;
            else if (lt > pos) {
                res += lt - pos;
                lt -= lt - pos;
                rt = lt + m - 1;
            } else if (rt < pos) {
                res += pos - rt;
                rt += pos - rt;
                lt = rt - m + 1;
            }
        }

        System.out.println(res);
    }
}