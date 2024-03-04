import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sb.append(arr[s.charAt(i) - '0']);
        }
        
        if (s.equals("0")) System.out.println(0);
        else {
            while (sb.charAt(0) == '0') {
                sb = new StringBuilder(sb.substring(1));
            }
            System.out.println(sb);
        }
    }

}