import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int res = Integer.parseInt(br.readLine());
        res += Integer.parseInt(br.readLine());
        
        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}