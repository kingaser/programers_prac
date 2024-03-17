import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int T, n, m;
    static Integer[] arr;
    private static void solution() {
        Queue<Paper> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Paper(i, arr[i]));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int index = 0;
        int cnt = 0;
        while (!q.isEmpty()) {
            Paper p = q.poll();
            if (p.importance == arr[index]) {
                cnt++;
                index++;
                if (p.idx == m) {
                    System.out.println(cnt);
                    break;
                }
            } else {
                q.offer(p);
            }
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            T = Integer.parseInt(br.readLine());

            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());

                arr = new Integer[n];

                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[j] = Integer.parseInt(st.nextToken());
                }

                solution();
            }

        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}

class Paper {
    int idx;
    int importance;

    public Paper(int idx, int importance) {
        this.idx = idx;
        this.importance = importance;
    }
}