import java.io.*;
import java.util.*;

class Main {
    //트럭과 다리를 큐로 사용
    public String solution(int n, int l, int w, Deque<Integer> truck) {
        Deque<Integer> bridge = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        // 걸리는 시간 cnt, 다리의 현재 무게 weight
        int cnt = 0, weight = 0;

        // 다리의 길이만큼 bridge큐를 0으로 채움
        while (l-- > 0) {
            bridge.offer(0);
        }

        // bridge큐가 비어있을때 까지 반복
        while (!bridge.isEmpty()) {
            cnt++; // <-- 여기서만 시간 추가
            // bridge큐에서 앞의값을 하나 빼서 현재 다리의 무게에서 빼줌
            weight -= bridge.poll();
            // 트럭 큐가 안 비어있으면 if문으로 트럭 큐가 비면 모든 트럭이 다리에 올라갔거나 다리를 건넘
            if (!truck.isEmpty()) {
                // 현재 다리의 무게와 트럭 큐의 맨 앞의 트럭의 무게를 더해서 다리가 버틸수 있는 무게와 비교
                // 다리가 버틸수 있는 무게보다 작거나 같으면 다리에 트럭을 올릴수 있음
                if (weight + truck.peek() <= w) {
                    // 조건을 충족하므로 다리의 무게에 트럭의 무게를 더함
                    weight += truck.peek();
                    // 다리 큐에 트럭큐의 맨 앞의 트럭을 추가 트럭이 다리위에 올라감
                    bridge.offer(truck.poll());
                } else {
                    // 현재 다리위에 올라가있는 트럭의 무게와 트럭 큐의 맨 앞의 무게의 합이
                    // 다리가 버틸수 있는 무게보다 크면 다리 큐에 0을 추가해 다리의 길이를 유지
                    bridge.offer(0);
                }
            }
        }
        
        sb.append(cnt);
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        Deque<Integer>truck = new LinkedList<>();
        
        st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            truck.offer(Integer.parseInt(st.nextToken()));
        }
        
        bw.write(T.solution(n, l, w, truck));
        bw.flush();
        bw.close();
    }
}
