import java.util.Scanner;

class Main {
    private static int solution(int k, char[] arr) {

        int cnt = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 'P') {
                for (int j = i - k; j <= i + k; j++) {
                    if (j >= 0 && j < len && arr[j] == 'H') {
                        arr[j] = ' ';
                        cnt++;
                        break;
                    }
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        char[] arr = kb.next().toCharArray();

        System.out.println(solution(k, arr));

    }
}