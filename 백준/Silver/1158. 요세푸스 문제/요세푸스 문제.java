import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    private static void solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 0; i < n; i++) {
            q.offer(i + 1);
        }

        int cnt = 0;
        while (q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        solution(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
    }
}