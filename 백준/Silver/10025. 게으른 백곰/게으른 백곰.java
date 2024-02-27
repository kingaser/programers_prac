import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] ice = new int[n];
        int[] pos = new int[n];
        int maxPos = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            ice[i] = Integer.parseInt(st.nextToken());
            pos[i] = Integer.parseInt(st.nextToken());
            maxPos = Math.max(maxPos, pos[i]);
        }

        int[] arr = new int[maxPos + 1];

        for (int i = 0; i < n; i++) {
            arr[pos[i]] = ice[i];
        }

        int end = k + k;
        int max = 0;
        int res = 0;
        
        if (arr.length < end) {
            for (int i = 0; i < arr.length; i++) {
                res += arr[i];
            }
            bw.write(res + "");
            bw.flush();
            bw.close();
            return;
        }
        for (int i = 0; i < end; i++) {
            max += arr[i];
        }

        for (int i = end + 1; i < arr.length; i++) {
            max = max - arr[i - end - 1] + arr[i];
            res = Math.max(res, max);
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
    }
}