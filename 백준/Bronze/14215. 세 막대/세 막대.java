import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int[] arr = new int[3];
        arr[0] = kb.nextInt();
        arr[1] = kb.nextInt();
        arr[2] = kb.nextInt();
        Arrays.sort(arr);
        if (arr[0] + arr[1] <= arr[2]) {
            arr[2] = arr[0] + arr[1] - 1;
        }
        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}