import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] board = new int[101][101];
        int res = 0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (board[j][k] == 0) {
                        board[j][k] = 1;
                        res++;
                    }
                }
            }
        }
        
        System.out.println(res);
    }
}