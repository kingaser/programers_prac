import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);
        int cnt = 0;
        
        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            cnt++;
        }
        
        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}