import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            
            int gap = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) {
                gap = Math.max(gap, arr[j] - arr[j - 1]);
            }
            sb.append("Class ").append(i + 1).append("\n").append("Max ")
                .append(arr[n - 1]).append(", Min ").append(arr[0]).append(", Largest gap ")
                .append(gap).append("\n");
        }
        
        System.out.println(sb);
    }
}