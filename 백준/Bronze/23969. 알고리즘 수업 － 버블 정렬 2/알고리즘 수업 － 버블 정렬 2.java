import java.io.*;
import java.util.*;

class Main {
    public String solution(int n, int m, int[] arr) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1] && cnt < m) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    cnt++;
                }
            }
            if (cnt == m) break;
        }
        if (cnt < m) return "-1";
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        bw.write(T.solution(n, m, arr));
        bw.flush();
        bw.close();
    }
}