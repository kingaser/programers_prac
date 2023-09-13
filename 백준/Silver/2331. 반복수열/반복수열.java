import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = kb.nextInt();
        int b = kb.nextInt();
        list.add(a);

        while (true) {
            int tmp = a;
            int res = 0;
            while (tmp > 0) {
                res += (int) Math.pow(tmp % 10, b);
                tmp /= 10;
            }
            a = res;
            if (list.contains(a)) {
                System.out.println(list.indexOf(a));
                break;
            }
            list.add(a);
        }
    }
}