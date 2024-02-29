import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < 101; i++) {
            arr[i] = arr[i - 2] + arr[i - 3];
        }

        for (int i = 0; i < T; i++) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}