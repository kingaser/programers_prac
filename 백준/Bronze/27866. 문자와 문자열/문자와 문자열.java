import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        int n = kb.nextInt();
        System.out.println(str.charAt(n-1));
    }
}