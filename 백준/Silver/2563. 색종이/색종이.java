import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int cnt = 0;
        int[][] arr = new int[100][100];

        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if (arr[j][k] == 0) {
                        arr[j][k] = 1;
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}