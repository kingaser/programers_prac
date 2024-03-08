import java.io.*;
import java.util.ArrayList;

class Main {
    static int nowX, nowY, prevX, prevY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> visit = new ArrayList<>();
        String s = br.readLine();
        int startX = s.charAt(0);
        int startY = s.charAt(1);
        visit.add(s);
        prevX = startX;
        prevY = startY;
        for (int i = 0; i < 35; i++) {
            s = br.readLine();
            if (visit.contains(s)) {
                System.out.println("Invalid");
                return;
            }
            nowX = s.charAt(0);
            nowY = s.charAt(1);

            if ((Math.abs(nowX - prevX) == 2 && Math.abs(nowY - prevY) == 1) ||
                    (Math.abs(nowX - prevX) == 1 && Math.abs(nowY - prevY) == 2)) {
            } else {
                System.out.println("Invalid");
                return;

            }
            visit.add(s);
            prevX = nowX;
            prevY = nowY;
        }

        if ((Math.abs(nowX - startX) == 2 && Math.abs(nowY - startY) == 1) ||
                (Math.abs(nowX - startX) == 1 && Math.abs(nowY - startY) == 2)) {
        } else {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
    }
}