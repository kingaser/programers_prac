import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int len = s.length();
        int res = 0;

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                res += (s.charAt(i) - '0') * (int) Math.pow(16, len - i - 1);
            } else {
                res += (s.charAt(i) - 'A' + 10) * (int) Math.pow(16, len - i - 1);
            }
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}