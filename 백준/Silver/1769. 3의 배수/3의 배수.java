import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int cnt = 0;
        while (s.length() != 1) {
            int sum = 0;
            cnt++;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
            s = String.valueOf(sum);
        }

        System.out.println(cnt);
        if (isMultiple(Integer.parseInt(s)))  System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean isMultiple(int n) {
        return n == 3 || n == 6 || n == 9;
    }
}