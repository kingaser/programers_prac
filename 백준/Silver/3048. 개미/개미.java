import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static String s1, s2;
    static int cnt;
    private static void solution() {
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        char[] arr = (sb + s2).toCharArray();
        int len = arr.length;
        for (int i = 0; i < cnt; i++) {
            boolean[] swap = new boolean[len];
            for (int j = 1; j < len; j++) {
                if (!swap[j] && !swap[j - 1]) {
                    if (s1.contains(String.valueOf(arr[j - 1])) && s2.contains(String.valueOf(arr[j]))) {
                        char c = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = c;
                        swap[j] = true;
                        swap[j - 1] = true;
                    }
                }
            }
        }

        for (char x : arr) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s1 = br.readLine();
        s2 = br.readLine();
        cnt = Integer.parseInt(br.readLine());
        solution();
    }
}