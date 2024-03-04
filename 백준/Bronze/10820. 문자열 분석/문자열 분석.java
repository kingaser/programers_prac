import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;
        while ((s = br.readLine()) != null) {
            char[] arr = s.toCharArray();
            int len = arr.length;
            int[] cnt = new int[4];
            for (int i = 0; i < len; i++) {
                if ('a' <= arr[i] && arr[i] <= 'z') {
                    cnt[0]++;
                } else if('A' <= arr[i] && arr[i] <= 'Z') {
                    cnt[1]++;
                } else if ('0' <= arr[i] && arr[i] <= '9') {
                    cnt[2]++;
                } else {
                    cnt[3]++;
                }
            }

            for (int i = 0; i < 4; i++) {
                sb.append(cnt[i]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}