import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        List<Integer> list;
        while (true) {
            int n = kb.nextInt();
            int sum = 0;

            if (n == -1) break;
            list = new ArrayList<>();

            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print(n + " = " + list.get(0));
                for (int i = 1; i < list.size(); i++) {
                    System.out.print(" + " + list.get(i));
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}