import java.io.*;
import java.util.*;

class Main {
    /*
    우선순위 큐 사용 이유
    앞에서 더한 값이 큐의 다음 값보다 크면 뒤로 미루기 위해서 사용
    int 가 아닌 long 사용 이유
    첫째 줄에 N이 주어진다. (1 ≤ N ≤ 100,000) 이어서 N개의 줄에 걸쳐 숫자 카드 묶음의 각각의 크기가 주어진다.
    숫자 카드 묶음의 크기는 1,000보다 작거나 같은 양의 정수이다.
    1000 가까이의 수를 100,000개 받아서 더하면 int값의 범위를 초과함
    */
    public String solution(long n, PriorityQueue<Long> pq) {
        long sum = 0;
        // 큐에서 2개의 값을 추출해서 더해야 하기 때문에 큐의 크기는 1보다 커야함
        while (pq.size() > 1) {
            long sum1 = pq.poll();
            long sum2 = pq.poll();

            // 변수 sum 에 누적합을 해줌
            sum += sum1 + sum2;
            // sum1과 sum2의 합을 큐에 다시 추가
            pq.offer(sum1 + sum2);
        }

        return sum + "";
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        while (n-- > 0) {
            pq.offer(Long.parseLong(br.readLine()));
        }

        bw.write(T.solution(n, pq));
        bw.flush();
        bw.close();
    }
}
