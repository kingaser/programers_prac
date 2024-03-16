import java.io.*;
import java.util.HashMap;

class Main {
    static int n;
    static String[] words;
    private static void solution() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = words[i];
            boolean flag = false;
            if (map.containsKey(s)) {
                flag = true;
            } else {
                int len = s.length();
                for (int j = 0; j < len; j++) {
                    s = s.substring(len - 1) + s.substring(0, len - 1);
                    if (map.containsKey(s)) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) map.put(words[i], 0);
        }

        System.out.println(map.size());
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = br.readLine();
            }
            solution();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}