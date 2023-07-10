import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            A[i] = Integer.parseInt(st.nextToken());

        int[] B = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            B[i] = Integer.parseInt(st.nextToken());

        int[] C = new int[n]; // A, B의 같은 위치 원소가 같을 때 1을 담아주는 배열
        int sum = 0; // 같을 때 1, 다를 때 0

        // 배열C 초기세팅
        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                C[i] = 1;
                sum++;
            }
        }

        // sorting
        int temp;
        if (sum != n) {
            exit:
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    // 오름차순 정렬
                    if (A[j] > A[j + 1]) {
                        // swap
                        temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;

                        // j와 j+1를 바꾸었으니 c와 sum을 업데이트!!
                        if (A[j] == B[j]) {  // 0 -> 1 : sum++
                            C[j] = 1;
                            sum++;
                        } else if (C[j] == 1) {  // 1 -> : sum--
                            C[j] = 0;
                            sum--;
                        } else {    // 0 -> 0 : sum 그대로
                            C[j] = 0;
                        }

                        // j+1 작업
                        if (A[j + 1] == B[j + 1]) {
                            C[j + 1] = 1;
                            sum++;
                        } else if (C[j + 1] == 1) {
                            C[j + 1] = 0;
                            sum--;
                        } else {
                            C[j + 1] = 0;
                        }
                    }

                    // 배열이 같을 때(sum==n)일 때 탈출해야함. 여기서 더 swap 해버리면 C가 달라저버럼.
                    // 이 떄문에 탈출을 위해 C배열 뿐만 아니라 sum이 필요함!
                    if (sum == n)
                        break exit;
                }
            }
        }
        // C에 0이 있는지 확인(A와 B의 원소가 다른게 있는지)
        boolean flag = true;
        for (int e : C) {
            if (e == 0)
                flag = false;
        }

        if (flag)   // 다른게 없다면 1
            System.out.println(1);
        else    // 다른게 하나라도 있으면 0
            System.out.println(0);
    }
}