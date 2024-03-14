import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Main {
    static int n;
    static List<Integer> list;

    private static void solution() {
        int min = Integer.MAX_VALUE;
        for (int x : list) {
            int cnt = 5;
            for (int i = x; i < x + 5; i++) {
                if (list.contains(i)) {
                    cnt--;
                }
            }
            min = Math.min(cnt, min);
        }
        
        System.out.println(min);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        solution();
    }
}