import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] eachTimes = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int person = Integer.parseInt(st.nextToken());

            int timeSum = 0;
            for (int j = 0; j < person; j++) {
                timeSum += Integer.parseInt(st.nextToken());
            }
            eachTimes[i] = timeSum;
        }

        Arrays.sort(eachTimes);
        int totalTime = eachTimes[0];
        for (int i = 1; i < n; i++) {
            eachTimes[i] += eachTimes[i - 1];
            totalTime += eachTimes[i];
        }

        bw.write(totalTime + "");
        bw.flush();
        bw.close();
    }
}