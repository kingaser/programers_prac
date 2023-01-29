import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        Iterator<Integer> it = set.iterator();
        int[] answer = new int[set.size()];
        int i = 0;
        while (it.hasNext()) {
            answer[i++] = it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}