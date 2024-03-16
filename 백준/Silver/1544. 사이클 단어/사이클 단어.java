import java.io.*;
import java.util.Arrays;

class Main {
    static int n;
    static String[] words;

    private static void solution() {
        int cnt = 1;
        int[] ch = new int[n];
        for (int i = 0; i < n; i++) {
            if (ch[i] == 0) ch[i] = i + 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int len = words[i].length();

                if (ch[j] == 0) {
                    if (len == words[j].length()) {
                        if (!words[i].equals(words[j])) {
                            for (int k = 0; k < len; k++) {
                                words[j] = words[j].substring(len - 1) + words[j].substring(0, len - 1);
                                if (words[i].equals(words[j])) {
                                    ch[j] = i + 1;
                                    break;
                                }
                            }
                        } else {
                            ch[j] = i + 1;
                        }
                    }
                }
            }
        }

        Arrays.sort(ch);

        for (int i = 1; i < n; i++) {
            if (ch[i] != ch[i - 1]) cnt++;
        }

        System.out.println(cnt);
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
        } catch (Exception e) {
            System.out.println("오류 발생");
        }
    }
}