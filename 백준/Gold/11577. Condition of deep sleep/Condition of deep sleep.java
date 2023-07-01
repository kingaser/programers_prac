import java.io.*;
import java.util.*;

class Main {
    public String solution(int n, int k, int[] arr) {
        // 최대 100000개의 전구 까지 이므로 100001로 배열 생성
        int[] tmp = new int[100001];
        // 첫번째 요소에 입력받은 전구의 첫번째 상태와 XOR 연산으로 결과배열의 첫번째 요소 지정
        tmp[0] = arr[0] ^ 0;
        // 결과 배열의 모든 요소를 XOR연산으로 초기화
        for (int i = 1; i < n; i++) {
            tmp[i] = arr[i] ^ arr[i - 1];
        }
        int cnt = 0;
        // n - k번까지만 돌면 됨
        for (int i = 0; i <= n - k; i++) {
            // 결과 배열의 i번째 요소가 0보다 크면 전구가 켜져있는 상태
            if (tmp[i] > 0) {
                // 1과 XOR 연산으로 전구를 꺼버림
                tmp[i] ^= 1;
                // i + k 번째의 요소도 1과 XOR연산
                tmp[i + k] ^= 1;
                cnt++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        
        if (fin(n, tmp)) return sb.toString();
        else return "Insomnia";
    }
    
    // 결과 배열에 전구의 상태 확인
    private boolean fin(int n, int[] tmp) {
        for (int i = 0; i < n; i++) {
            // 결과 배열의 전구가 켜져있으면 false 반환
            if (tmp[i] > 0) return false;
        }
        // 위에서 전구가 켜져있지 않아서 for문을 빠져나오니 전구가 전부 꺼져있으므로 true
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[100001];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        bw.write(T.solution(n, k, arr));
        bw.flush();
        bw.close();
    }
}