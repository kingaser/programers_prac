import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int[] ch = new int[n+1];

        for (int i = 2; i < n+1; i++) {
            if (n%i == 0 && ch[i] == 0) {
                ch[i] = 1;
                list.add(i);
            }
            for(int j = i; j < n+1; j += i) {
                ch[j] = 1;
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}