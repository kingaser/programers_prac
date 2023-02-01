import java.util.Scanner;

class Main {
    public int solution(int a) {
        int res = 0;
        int money = 1000 - a;
        while (money > 0) {
            if (money >= 500) {
                money -= 500;
                res++;
            } else if (money >= 100) {
                money -= 100;
                res++;
            } else if (money >= 50) {
                money -= 50;
                res++;
            } else if (money >= 10) {
                money -= 10;
                res++;
            } else if (money >= 5) {
                money -= 5;
                res++;
            } else {
                money -= 1;
                res++;
            } 
        }
        return res;
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        System.out.println(T.solution(a));
    }
}