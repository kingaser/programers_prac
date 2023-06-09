import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        char[][] board = new char[5][15];
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = kb.nextLine();
            for (int j = 0; j < arr[i].length(); j++) {
                board[i][j] = arr[i].charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] > 0) {
                    sb.append(board[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}