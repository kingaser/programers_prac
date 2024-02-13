import java.util.*;
import java.io.*;

class Main {
    static int v, e;
    static ArrayList<Integer>[] arr;
    static int[] visit;

    public static void solution() {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= v; i++) {
            if (visit[i] == 0) {
                q.add(i);
                visit[i] = 1;
            }

            while (!q.isEmpty()) {
                int now = q.poll();

                for (int j = 0; j < arr[now].size(); j++) {
                    if (visit[arr[now].get(j)] == 0) q.add(arr[now].get(j));

                    if (visit[now] == visit[arr[now].get(j)]) {
                        System.out.println("NO");
                        return;
                    }

                    if (visit[now] == 1 && visit[arr[now].get(j)] == 0) {
                        visit[arr[now].get(j)] = 2;
                    } else if (visit[now] == 2 && visit[arr[now].get(j)] == 0) {
                        visit[arr[now].get(j)] = 1;
                    }
                }
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            arr = new ArrayList[v + 1];
            visit = new int[v + 1];

            for (int j = 1; j <= v; j++) {
                arr[j] = new ArrayList<>();
            }

            for (int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a].add(b);
                arr[b].add(a);
            }
            solution();
        }
    }
}