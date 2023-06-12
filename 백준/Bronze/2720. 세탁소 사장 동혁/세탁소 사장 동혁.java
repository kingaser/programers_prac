import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] sent = {25, 10, 5, 1};
        int[][] coins = new int[n][4];

        for (int i = 0; i < n; i++) {
            int c = kb.nextInt();
            for (int j = 0; j < 4; j++) {
                coins[i][j] = c / sent[j];
                c %= sent[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(coins[i][j] + " ");
            }
            System.out.println();
        }
    }
}