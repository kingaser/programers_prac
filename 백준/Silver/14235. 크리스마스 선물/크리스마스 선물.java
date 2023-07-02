import java.io.*;
import java.util.*;

class Main {
    static StringBuilder sb = new StringBuilder();
    public void solution(int i, int presentCharge, PriorityQueue<Integer> presentPQ) {
        if (i < presentCharge) {
            sb.append("-1\n");
        } else if (i > presentCharge) {
            if (!presentPQ.isEmpty()) {
                sb.append(presentPQ.poll()).append("\n");
            } else {
                sb.append("-1\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int presentCharge = Integer.MAX_VALUE;
        PriorityQueue<Integer> presentPQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            if (!tmp.equals("0")) {
                presentCharge = i;
                String[] present = tmp.split(" ");
                for (int j = 1; j < present.length; j++) {
                    presentPQ.offer(Integer.parseInt(present[j]));
                }
            } else {
                T.solution(i, presentCharge, presentPQ);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}