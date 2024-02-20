import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 2147000000;
        int index = 0;
        int[] arr = new int[11];
        for (int i = 1; i < 11; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < 11; i++) {
            if (arr[i] == 100) {
                index = i;
                break;
            } else if (Math.abs(arr[i] - 100) < max) {
                max = Math.abs(arr[i] - 100);
                index = i;
            } else if (Math.abs(arr[i] - 100) == max && arr[i] > arr[index]) {
                index = i;
            }
        }

        bw.write(arr[index] + "\n");
        bw.flush();
        bw.close();
    }
}