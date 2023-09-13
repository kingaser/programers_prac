import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        int res = 0, tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                tmp++;
                res += tmp;
            } else {
                tmp = 0;
            }
        }

        System.out.println(res);
    }
}