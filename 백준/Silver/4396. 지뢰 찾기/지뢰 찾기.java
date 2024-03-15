import java.io.*;

class Main {
    static int n;
    static char[][] map, boom;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    
    private static void solution() {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                if (map[i][j] == 'x') {
                    if (boom[i][j] == '*') {
                        flag = true;
                    } else {
                        for (int k = 0; k < 8; k++) {
                            int x = i + dx[k];
                            int y = j + dy[k];
                            
                            if (x < 0 || x >= n || y < 0 || y >= n) continue;
                            
                            if (boom[x][y] == '*') cnt++;
                        }
                    }
                    map[i][j] = (char) (cnt + '0');
                }
            }
        }
        
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (boom[i][j] == '*') {
                        map[i][j] = '*';
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            map = new char[n][n];
            boom = new char[n][n];
            
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                for (int j = 0; j < n; j++) {
                    boom[i][j] = s.charAt(j);
                }
            }
            
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                for (int j = 0; j < n; j++) {
                    map[i][j] = s.charAt(j);
                }
            }
            solution();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}