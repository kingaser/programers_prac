import java.util.*;
import java.io.*;

class Main {
    public String solution(HashMap<Integer, Integer> countMap, int[] cards) {
        StringBuilder sb = new StringBuilder();
        for (int a : cards) {
            if (countMap.containsKey(a)) {
                sb.append(countMap.get(a) + " ");
            } else {
                sb.append(0 + " ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> countMap = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            countMap.put(a, countMap.getOrDefault(a, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[m];
        for (int i = 0; i < m; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(T.solution(countMap, cards));
        bw.flush();
        bw.close();
    }
}