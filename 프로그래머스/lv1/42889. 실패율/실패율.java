import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] ch = new int[N+1];
        for (int x : stages) {
           ch[x-1]++;
        }
        double[][] fail = failed(ch, stages.length);
        Arrays.sort(fail, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[0], o1[0]);
            }
        });
        for (int i = 0; i < N; i++) {
            answer[i] = (int) fail[i][1];
        }
        return answer;
    }
    // ch[] = {1, 3, 2, 1, 0, 1}
    public double[][] failed(int[] ch, int len) {
        double[][] res = new double[ch.length-1][2];
        double tmp = len;
        for (int i = 0; i < ch.length-1; i++) {
            if (i > 0) {
                tmp -= ch[i-1];
            }
            if (ch[i] == 0) {
                res[i][0] = 0;
                res[i][1] = i+1;
            }
            else {
                res[i][0] = ch[i] == 0 ?  0 : (ch[i]/tmp)*100;
                res[i][1] = i+1;
            }
        }
        return res;
    }
}