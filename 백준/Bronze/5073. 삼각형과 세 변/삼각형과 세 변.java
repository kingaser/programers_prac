//Equilateral, Isosceles, Scalene, Invalid
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String answer = "";
        int[] tri = new int[3];
        while (true) {
            tri[0] = kb.nextInt();
            tri[1] = kb.nextInt();
            tri[2] = kb.nextInt();

            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0) break;

            Arrays.sort(tri);

            if (tri[0] + tri[1] <= tri[2]) {
                answer = "Invalid";
            } else {
                if (tri[0] == tri[1] && tri[1] == tri[2]) {
                    answer = "Equilateral";
                } else if (tri[0] == tri[1] || tri[0] == tri[2] || tri[1] == tri[2]) {
                    answer = "Isosceles";
                } else {
                    answer = "Scalene";
                }
            }
            System.out.println(answer);
        }
    }
}