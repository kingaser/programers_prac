import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            sb.append(arr[b] - arr[a - 1]).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}