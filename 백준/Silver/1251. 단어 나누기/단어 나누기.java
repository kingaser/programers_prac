import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        List<String> list = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                StringBuilder s1 = new StringBuilder(s.substring(0, i));
                StringBuilder s2 = new StringBuilder(s.substring(i, j));
                StringBuilder s3 = new StringBuilder(s.substring(j));
                StringBuilder sb = new StringBuilder();
                sb.append(s1.reverse()).append(s2.reverse()).append(s3.reverse());
                list.add(sb.toString());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}