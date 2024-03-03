import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[200];
        int idx = 0;

        for (int i = 1; i < 200; i++) {
            arr[i] = (int) Math.pow(i, 2);
            if (arr[i] < n) idx = i;
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = idx; ; i++) {
            if (n <= arr[i] && arr[i] <= m) {
                min = Math.min(min, arr[i]);
                sum += arr[i];
            }
            if (arr[i] > m) break;
        }

        if (sum == 0) bw.write("-1");
        else bw.write(sum + "\n" + min);

        bw.flush();
        bw.close();
    }
}