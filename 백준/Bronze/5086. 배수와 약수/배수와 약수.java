import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            int n = kb.nextInt();
            int m = kb.nextInt();

            if (n == 0 && m == 0) break;

            if (m % n == 0) {
                System.out.println("factor");
            } else if (n % m == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}