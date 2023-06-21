import java.util.*;
import java.io.*;

class Main {
    public String solution(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(words[0]).append("\n");
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1])) {
                sb.append(words[i]).append("\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        bw.write(T.solution(words));
        bw.flush();
        bw.close();
    }
}