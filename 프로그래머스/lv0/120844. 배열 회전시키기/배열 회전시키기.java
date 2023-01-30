import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        LinkedList<Integer> list = new LinkedList<>();
        // list에 numbers값 대입
        for (int x : numbers) {
            list.add(x);
        }
        // 결과 배열 길이 지정
        int[] answer = new int[numbers.length];
        // left인지 right인지 확인
        if (direction.equals("right")) {
            // right면 list의 0번쨰에 list의 마지막 값 대입 하면서 마지막 값은 삭제
            list.add(0, list.remove(list.size()-1));
        } else {
            // left면 list의 끝에 list의 첫번째 값 대입 하면서 첫번쨰 값 삭제
            list.add(list.remove(0));
        }
        // 결과배열에 list값 대입
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}