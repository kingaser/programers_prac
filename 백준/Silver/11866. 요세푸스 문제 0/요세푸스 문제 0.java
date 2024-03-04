import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(i + 1);
        }

        sb.append("<");
        int cnt = 1;
        while (!q.isEmpty()) {
            if (cnt % k == 0) {
                if (q.size() == 1) sb.append(q.poll()).append(">");
                else sb.append(q.poll()).append(", ");
            } else {
                q.offer(q.poll());
            }
            cnt++;
        }
        System.out.println(sb);
    }
}