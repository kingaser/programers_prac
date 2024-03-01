import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        int seat = 0;
        int plus = 1;
        int num = 10;
        for (int i = 1; i <= n; i++) {
            if (i % num == 0) {
                plus++;
                num *= 10;
            }
            seat += plus;
        }
        
        bw.write(seat + "");
        bw.flush();
        bw.close();
    }
}