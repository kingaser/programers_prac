import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(numlist);
        for(int x : numlist) list.add(x);
        list.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
        Collections.reverse(list);
        return list.stream().mapToInt(x -> x).toArray();
    }
}