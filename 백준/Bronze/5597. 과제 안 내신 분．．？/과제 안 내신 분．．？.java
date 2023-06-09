import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[31];
        Arrays.fill(arr, 0);
        for (int i = 1; i <= 28; i++) {
            int tmp = kb.nextInt();
            arr[tmp] = 1;
        }

        for (int i = 1; i <=30; i++) {
            if (arr[i] == 0) System.out.println(i);
        }
    }
}