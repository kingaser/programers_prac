import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] hash = br.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (hash[i] - 'a' + 1) * (int) Math.pow(31, i);
        }

        System.out.println(sum);
    }
}