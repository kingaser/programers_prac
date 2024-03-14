import java.io.*;

class Main {
    static int n;
    static char[][] body;
    static int waistX = 0, waistY = 0;

    private static void solution() {
        int hartX = 0, hartY = 0;

        boolean flag = false;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (body[i][j] == '*' && body[i - 1][j] == '*') {
                    hartX = i;
                    hartY = j;
                    System.out.println(i + 1 + " " + (j + 1));
                    flag = true;
                }
            }
            if (flag) break;
        }
        leftArm(hartX, hartY);
        rightArm(hartX, hartY);
        waist(hartX, hartY);
        leg();
    }

    private static void leftArm(int x, int y) {
        int cnt = 0;
        for (int i = y - 1; i >= 0; i--) {
            if (body[x][i] == '*') cnt++;
            else break;
        }
        System.out.print(cnt + " ");
    }

    private static void rightArm(int x, int y) {
        int cnt = 0;
        for (int i = y + 1; i < n; i++) {
            if (body[x][i] == '*') cnt++;
            else break;
        }
        System.out.print(cnt + " ");
    }

    private static void waist(int x, int y) {
        int cnt = 0;
        for (int i = x + 1; i < n; i++) {
            if (body[i][y] == '*') cnt++;
            else {
                waistX = i - 1;
                waistY = y;
                break;
            }
        }
        System.out.print(cnt + " ");
    }

    private static void leg() {
        int cnt = 0;
        int legX = waistX + 1;
        int leftLegY = waistY - 1;
        int rightLegY = waistY + 1;
        for (int i = legX; i < n; i++) {
            if (body[i][leftLegY] == '*') cnt++;
            else break;
        }
        System.out.print(cnt + " ");
        cnt = 0;
        for (int i = legX; i < n; i++) {
            if (body[i][rightLegY] == '*') cnt++;
        }
        System.out.print(cnt);
    }


    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            body = new char[n][n];

            for (int i = 0; i < n; i++) {
                body[i] = br.readLine().toCharArray();
            }
            solution();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}