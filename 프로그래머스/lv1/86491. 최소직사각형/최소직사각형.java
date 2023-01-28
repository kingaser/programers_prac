import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        for (int[] size : sizes) {
            Arrays.sort(size);
        }
        int a = 0, b = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > a) a = sizes[i][0];
            if (sizes[i][1] > b) b = sizes[i][1];
        }
        return a*b;
    }
}