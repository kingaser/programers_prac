import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] s = br.readLine().split("-");
        int len = s.length;
        for (int i = 0; i < len; i++) {
            sb.append(s[i].charAt(0));
        }
        
        System.out.println(sb);
    }
}