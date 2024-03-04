import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            q.offer(i + 1);
        }

        while (true) {
            sb.append(q.poll()).append(" ");
            if (q.isEmpty()) break;
            q.offer(q.poll());
        }

        System.out.println(sb);
    }
}