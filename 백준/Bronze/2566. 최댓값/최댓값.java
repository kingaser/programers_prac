import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int[] pos = new int[2];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = kb.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    pos[0] = i + 1;
                    pos[1] = j + 1;
                }
            }
        }

        System.out.print(max + "\n" + pos[0] + " " + pos[1]);
    }
}