import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int presentCharge = Integer.MAX_VALUE;
        PriorityQueue<Integer> presentPQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            if (!tmp.equals("0")) {
                presentCharge = i;
                String[] present = tmp.split(" ");
                arr[i] = Integer.parseInt(present[0]);
                for (int j = 1; j < present.length; j++) {
                    presentPQ.offer(Integer.parseInt(present[j]));
                }
            } else {
                if (i < presentCharge) {
                    sb.append("-1\n");
                } else if (i > presentCharge) {
                    if (!presentPQ.isEmpty()) {
                        sb.append(presentPQ.poll()).append("\n");
                    } else {
                        sb.append("-1\n");
                    }
                }
                arr[i] = Integer.parseInt(tmp);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}