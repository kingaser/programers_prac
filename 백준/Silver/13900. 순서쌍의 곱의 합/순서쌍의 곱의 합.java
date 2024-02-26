import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        long res = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            res += sum * Integer.parseInt(arr[i]);
            sum += Integer.parseInt(arr[i]);
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}