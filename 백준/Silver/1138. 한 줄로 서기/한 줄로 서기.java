import java.util.Scanner;

class Main {
    public static int[] solution(int n, int[] arr) {
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == 0 && res[j] == 0) {
                    res[j] = i + 1;
                    break;
                } else if (res[j] == 0) {
                    arr[i] -= 1;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}