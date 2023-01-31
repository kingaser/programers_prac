import java.util.Scanner;

class Main {
    public int[] solution(int a, String[] str) {
        int[] res = new int[a];
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O') sum++;
                else sum = 0;
                res[i] += sum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        String[] b = new String[a];
        for (int i = 0; i < a; i++) {
            b[i] = kb.next();
        }
        for (int x : T.solution(a, b)) {
            System.out.println(x);
        }
    }
}