import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Main {

    static String s;

    private static void solution() {
        int len = s.length();

        List<String> list = new ArrayList<>();

        int startIdx = 0, endIdx = 0, normalIdx = 0;

        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '<') {
                startIdx = i;
                flag = true;
                if (startIdx != endIdx) {
                    list.add(s.substring(normalIdx, i));
                    normalIdx = i + 1;
                }
            } else if (s.charAt(i) == '>') {
                flag = false;
                list.add(s.substring(startIdx, i + 1));
                endIdx = i + 1;
                normalIdx = i + 1;
            }

            if (!flag && s.charAt(i) == ' ') {
                list.add(s.substring(normalIdx, i));
                list.add(" ");
                normalIdx = i + 1;
            }
        }
        if (normalIdx != len) {
            list.add(s.substring(normalIdx, len));
        }

        String res = "";
        for (String s : list) {
            if (s.contains("<")) res += s;
            else {
                char[] tmp = s.toCharArray();
                for (int i = 0; i < tmp.length / 2; i++) {
                    char c = tmp[i];
                    tmp[i] = tmp[tmp.length - i - 1];
                    tmp[tmp.length - i - 1] = c;
                }

                for (int i = 0; i < tmp.length; i++) {
                    res += String.valueOf(tmp[i]);
                }
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            s = br.readLine();
            solution();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}