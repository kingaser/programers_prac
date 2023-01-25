import java.util.*;

class Solution {
    public int[] solution(int a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (i%2 == 1) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}