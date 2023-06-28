import java.util.*;
import java.io.*;

class Main {
    static Deque<Integer> dq = new LinkedList<>();

    public String solution() {
        while (true) {
            if (dq.size() == 1) break;
            dq.poll();
            dq.offer(dq.poll());
        }
        int answer = dq.poll();

        return answer + "";
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            dq.offer(i);
        }

        bw.write(T.solution());
        bw.flush();
        bw.close();
    }
}