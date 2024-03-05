import java.io.*;
import java.util.PriorityQueue;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int dasom = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        while (!pq.isEmpty() && dasom <= pq.peek()) {
            pq.offer(pq.poll() - 1);
            cnt++;
            dasom++;
        }

        System.out.println(cnt);
    }
}