import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j += 2) {
                String tmp = s.substring(i, j);

                int firstSum = 0;
                int secondSum = 0;

                for (int k = 0; k < tmp.length() / 2; k++) {
                    firstSum += tmp.charAt(k) - '0';
                    secondSum += tmp.charAt(k + tmp.length() / 2) - '0';
                }

                if (firstSum == secondSum && tmp.length() > maxLen) {
                    maxLen = tmp.length();
                }
            }
        }

        bw.write(maxLen + "");
        bw.flush();
        bw.close();
    }
}