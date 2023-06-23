import java.util.*;
import java.io.*;

class Main {
    static int n;
    
    public int solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (int a : arr) {
            while (!st.empty() && st.peek() <= a) {
                st.pop();
            }
            st.push(a);
        }
        
        return st.size();
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        bw.write(T.solution(arr) + "");
        bw.flush();
        bw.close();
    }
}