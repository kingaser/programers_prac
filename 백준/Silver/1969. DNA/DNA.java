import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] dna = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            dna[i] = br.readLine();
        }

        int sum = 0;

        for (int i = 0; i < m; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int cnt = 0;
            char ch = ' ';
            for (int j = 0; j < n; j++) {
                char key = dna[j].charAt(i);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            for (Map.Entry<Character, Integer> x : map.entrySet()) {
                if (max < x.getValue()) {
                    max = x.getValue();
                    ch = x.getKey();
                } else if (max == x.getValue()) {
                    char tmp = x.getKey();
                    if (ch > tmp) {
                        ch = tmp;
                    }
                }
            }
            sum += n - max;
            sb.append(ch);
        }

        System.out.println(sb);
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}