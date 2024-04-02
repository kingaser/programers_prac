import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int n, m, b, min, max;
    static int[][] board;
    private static void solution() {
        int time = Integer.MAX_VALUE;
        int high = 0;
        
        for (int i = min; i <= max; i++) {
            int cnt = 0;
            int block = b;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (i < board[j][k]) {
                        cnt += (board[j][k] - i) * 2;
                        block += board[j][k] - i;
                    } else {
                        cnt += i - board[j][k];
                        block -= i - board[j][k];
                    }
                }
            }
            
            if (block < 0) break;
            
            if (time >= cnt) {
                time = cnt;
                high = i;
            }
        }
        
        System.out.println(time + " " + high);
    }
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            board = new int[n][m];
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                    min = Math.min(min, board[i][j]);
                    max = Math.max(max, board[i][j]);
                }
            }
            
            solution();
        } catch (IOException e) {
            System.out.println("입출력 오류" + e);
        }
    }
}