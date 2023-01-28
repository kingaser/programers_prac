import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String x : list) sb.append(x);

        return Long.parseLong(sb.reverse().toString());
    }
}