import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scoreList = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        double totalScore = 0.0;
        double scoreSum = 0.0;

        for (int i = 0; i < 20; i++) {
            String sub = kb.next();
            double score = kb.nextDouble();
            String grade = kb.next();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {
                    totalScore += score * scoreList[j];
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        double avg = totalScore / scoreSum;
        System.out.println(avg);

    }
}