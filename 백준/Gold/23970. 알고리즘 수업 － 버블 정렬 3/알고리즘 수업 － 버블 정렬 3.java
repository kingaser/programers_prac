import java.util.*;

class Main {
    static int n;

    public void solution(int[] arr, int[] arr2, int[] status) {
        int pos = n;
        if (comparing(pos, arr, status)) {
            System.out.println(1);
            return;
        }

        Arrays.sort(arr2);

        int len = n;
        for (int i = n - 1; i >= 0; i--) {
            if (arr2[i] != status[i]) {
                pos = i;
                break;
            }
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    if (arr[j] == status[j] && arr[j + 1] == status[j + 1]) {
                        if (comparing(pos, arr, status)) {
                            System.out.println(1);
                            return;
                        }
                    }
                }
            }
            len--;
        }

        for (int i = 0; i < pos; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                if (comparing(pos, arr, status)) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }

    private boolean comparing(int pos, int[] arr, int[] status) {
        if (Arrays.equals(arr, status)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] status = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            status[i] = kb.nextInt();
        }

        T.solution(arr, arr2, status);
    }
}