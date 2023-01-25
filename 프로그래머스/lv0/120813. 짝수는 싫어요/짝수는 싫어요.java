import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int a) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}