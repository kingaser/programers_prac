import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cows = br.readLine();

        int cnt = 0;
        int[] pos1 = new int[26];
        int[] pos2 = new int[26];

        for (int i = 0; i < 52; i++) {
            int idx = cows.charAt(i) - 'A';
            if (pos1[idx] == 0) pos1[idx] = i + 1;
            else pos2[idx] = i + 1;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (pos1[i] < pos1[j] && pos1[j] < pos2[i] && pos2[i] < pos2[j]) cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}