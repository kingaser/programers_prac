import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int len = s.length();
        int idx = 0;

        while (idx < len) {
            if (idx + 4 <= len && s.substring(idx, idx + 4).equals("XXXX")) {
                sb.append("AAAA");
                idx += 4;
                continue;
            }

            if (idx + 2 <= len && s.substring(idx, idx + 2).equals("XX")) {
                sb.append("BB");
                idx += 2;
                continue;
            }

            if (s.charAt(idx) == '.') {
                sb.append(".");
                idx++;
                continue;
            }

            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }
}