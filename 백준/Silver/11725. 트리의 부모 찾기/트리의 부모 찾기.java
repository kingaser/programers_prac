import java.util.*;

class Main {
    static int n;
    static int[] parent;
    static boolean[] visit;
    static ArrayList<Integer>[] list;

    public static void DFS(int index) {
        visit[index] = true;
        for (int i : list[index]) {
            if (!visit[i]) {
                parent[i] = index;
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        parent = new int[n + 1];
        visit = new boolean[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();

            list[x].add(y);
            list[y].add(x);
        }

        DFS(1);

        for (int i = 2; i < n + 1; i++) {
            System.out.println(parent[i]);
        }
    }
}