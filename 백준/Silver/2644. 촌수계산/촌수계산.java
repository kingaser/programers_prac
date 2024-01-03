import java.util.*;

class Main {

    static int n, s, e, m;
    static boolean[] isVisit;
    public static int DFS(int index, ArrayList<Integer>[] list, int depth) {
        isVisit[index] = true;

        if (index == e) return depth;

        for (int i : list[index]) {
            if (!isVisit[i]) {
                int res = DFS(i, list, depth + 1);
                if (res != -1) {
                    return res;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        n = kb.nextInt();
        s = kb.nextInt();
        e = kb.nextInt();
        m = kb.nextInt();

        isVisit = new boolean[n + 1];

        ArrayList<Integer>[] list = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int p = kb.nextInt();
            int c = kb.nextInt();

            list[p].add(c);
            list[c].add(p);
        }

        System.out.println(DFS(s, list, 0));

    }
}