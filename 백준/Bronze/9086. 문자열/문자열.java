import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        for (int i = 0; i < n; i++) {
            String str = kb.next();
            int m = str.length();
            String a = String.valueOf(str.charAt(0));
            String b = String.valueOf(str.charAt(m - 1));
            System.out.println(a + b);
        }
    }
}