import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String num = br.readLine();
        int[] arr = new int[9];
        
        int len = num.length();
        for (int i = 0; i < len; i++) {
            int idx = num.charAt(i) - '0';
            if (idx == 9) idx = 6;
            arr[idx]++;
        }
        
        arr[6] = (arr[6] + 1) / 2;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }
        
        System.out.println(max);
    }
}