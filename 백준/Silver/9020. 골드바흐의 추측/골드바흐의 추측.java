import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        boolean[] flag = new boolean[10001];
        flag[0] = true;
        flag[1] = true;

        for (int i = 2; i <= Math.sqrt(10001); i++) {
            if (!flag[i]) {
                for (int j = i + i; j < 10001; j += i) {
                    flag[j] = true;
                }
                flag[i] = false;
            }
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            int lt = n / 2, rt = n / 2;

            while (true) {
                if (!flag[lt] && !flag[rt]) {
                    sb.append(lt + " " + rt).append("\n");
                    break;
                }
                lt--;
                rt++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}