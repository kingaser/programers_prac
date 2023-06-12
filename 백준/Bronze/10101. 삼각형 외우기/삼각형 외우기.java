import java.util.*;

class Main {
    public String solution(int[] tmp) {
        if (tmp[0] + tmp[1] + tmp[2] != 180) {
            return "Error";
        }
        if (tmp[0] == tmp[1] && tmp[0] == tmp[2]) {
            return "Equilateral";
        } else if (tmp[0] == tmp[1] || tmp[0] == tmp[2] || tmp[1] == tmp[2]) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        
        int[] tmp = new int[3];
        
        for (int i = 0; i < 3; i++) {
            tmp[i] = kb.nextInt();
        }
        System.out.println(T.solution(tmp));
    }
}