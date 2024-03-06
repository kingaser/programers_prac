import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

class Main {
    private static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            if (s[0].equals("push_front")) {
                dq.offerFirst(Integer.parseInt(s[1]));
            } else if (s[0].equals("push_back")) {
                dq.offer(Integer.parseInt(s[1]));
            } else if (s[0].equals("pop_front")) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            } else if (s[0].equals("pop_back")) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            } else if (s[0].equals("size")) {
                sb.append(dq.size()).append("\n");
            } else if (s[0].equals("empty")) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            } else if (s[0].equals("front")) {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
            } else if (s[0].equals("back")) {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}