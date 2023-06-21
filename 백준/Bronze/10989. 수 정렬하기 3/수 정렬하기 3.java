import java.util.*;
import java.io.*;

class Main {
    public static int[] arr;

    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i + "\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[10001];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())]++;
        }

        System.out.println(T.solution(arr));
    }
}