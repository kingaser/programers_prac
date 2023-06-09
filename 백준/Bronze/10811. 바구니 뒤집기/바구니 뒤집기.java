import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            for (int j = s; j < e; j++, e--) {
                int tmp = arr[j];
                arr[j] = arr[e];
                arr[e] = tmp;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}