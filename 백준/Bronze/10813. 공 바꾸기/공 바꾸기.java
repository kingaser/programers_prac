import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            int tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;
        }
        for (int i = 1; i < n+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}