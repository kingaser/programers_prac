import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        // 선물을 충전하는 위치 인덱스 저장 처음은 가장 큰값으로 초기화
        int presentCharge = Integer.MAX_VALUE;
        // 큐의 우선순위를 역순으로 만듬
        PriorityQueue<Integer> presentPQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            // 계속 한개의 숫자만 들어오는 것이 아니라 String으로 일단 입력 받음
            String tmp = br.readLine();
            // 입력이 0이 아니면 충전소 들림
            if (!tmp.equals("0")) {
                // 충전소의 인덱스 저장
                presentCharge = i;
                // 충전소에 왔으니 선물들의 가치를 입력받음
                String[] present = tmp.split(" ");
                // 첫 번째 숫자는 선물의 갯수이니 두 번째 숫자부터 반복해서 선물의 큐에 추가
                for (int j = 1; j < present.length; j++) {
                    presentPQ.offer(Integer.parseInt(present[j]));
                }
                // 입력이 0일 때 아이들에게 선물을 줄 때
            } else {
                // i 가 충전소의 인덱스 보다 작다는 것은 선물이 없는데 아이한테 선물을 주려한 상황
                if (i < presentCharge) {
                    // 선물이 없으니 못주고 -1을 sb에 추가
                    sb.append("-1\n");
                    // 충전소에 들림
                } else if (i > presentCharge) {
                    // 선물이 남아있으면
                    if (!presentPQ.isEmpty()) {
                        // 큐의 맨 앞은 가장 가치 높은 선물이므로 그대로 줌 sb에 큐의 맨 앞의 요소 추가
                        sb.append(presentPQ.poll()).append("\n");
                    } else {
                        // 충전소에 들렀지만 선물이 남아있지 않음
                        sb.append("-1\n");
                    }
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
