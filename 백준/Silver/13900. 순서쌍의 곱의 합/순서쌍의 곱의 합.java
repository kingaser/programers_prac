import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        long result = calculateProductSum(N, A);
        System.out.println(result);
    }

    private static long calculateProductSum(int N, int[] A) {
        long totalSum = 0;
        long prefixSum = 0;

        for (int i = 0; i < N; i++) {
            totalSum += prefixSum * A[i];
            prefixSum += A[i];
        }

        return totalSum;
    }
}