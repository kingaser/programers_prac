import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] pibo = new int[46];

        for (int i = 1; i < 46; i++) {
            if (i == 1) pibo[i] = 1;
            else pibo[i] = pibo[i - 1] + pibo[i - 2];
        }

        System.out.println(pibo[n]);
    }
}