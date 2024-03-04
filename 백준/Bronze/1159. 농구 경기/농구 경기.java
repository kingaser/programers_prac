import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] last = new int[26];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            last[name.charAt(0) - 'a']++;
        }

        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if (last[i] >= 5) {
                sb.append((char)('a' + i));
                flag = true;
            }
        }

        if (flag) System.out.println(sb);
        else System.out.println("PREDAJA");
    }
}