import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        char[][] room = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            room[i] = br.readLine().toCharArray();
        }
        
        int xSpace = 0;
        int ySpace = 0;
        for (int i = 0; i < n; i++) {
            int xCnt = 0;
            int yCnt = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    xCnt++;
                    if (xCnt == 2) {
                        xSpace++;
                    }
                } else if (room[i][j] == 'X') xCnt = 0;
                if (room[j][i] == '.') {
                    yCnt++;
                    if (yCnt == 2) {
                        ySpace++;
                    }
                } else if (room[j][i] == 'X') yCnt = 0;
            }
        }
        
        System.out.println(xSpace + " " + ySpace);
    }
}