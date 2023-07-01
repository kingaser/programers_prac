import java.io.*;
import java.util.*;

class Main {
    public String solution(int n, int l, int w, Deque<Integer> truck) {
        Deque<Integer> bridge = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0, weight = 0;
        
        while (l-- > 0) {
            bridge.offer(0);
        }
        
        while (!bridge.isEmpty()) {
            cnt++;
            weight -= bridge.poll();
            if (!truck.isEmpty()) {
                if (weight + truck.peek() <= w) {
                    weight += truck.peek();
                    bridge.offer(truck.poll());
                } else {
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