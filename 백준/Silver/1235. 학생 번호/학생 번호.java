import java.io.*;

class Main {
    static int n;
    static String[] numbers;
    private static void solution() {
        int len = numbers[0].length();
        int res = 0;
        for (int k = len; k >= 0; k--) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    if (numbers[i].substring(k).equals(numbers[j].substring(k))) {
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
            if (!flag) {
                res = len - k;
                break;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = br.readLine();
        }
        solution();
    }
}