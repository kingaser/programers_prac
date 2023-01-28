import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int[] answer = {};
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
            if (x < min) min = x;
        }
        final int tmp = min;
        answer = Arrays.stream(arr).filter(i -> i != tmp).toArray();
        return answer;
    }
}