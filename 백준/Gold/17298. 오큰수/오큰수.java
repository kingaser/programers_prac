import java.io.*;
import java.util.*;

class Main {
    static int n;
    
    public String solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[st.peek()] < arr[i]) {
                arr[st.pop()] = arr[i];
            }
            st.push(i);
        }
        
        while (!st.empty()) {
            arr[st.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a).append(" ");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        bw.write(T.solution(arr));
        bw.flush();
        bw.close();
    }
}