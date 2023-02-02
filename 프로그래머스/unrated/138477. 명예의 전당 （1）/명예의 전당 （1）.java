import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        // 처음주는 배열의 길이와 결과 배열의 길이는 같다.
        int[] answer = new int[score.length];
        // 우선순위큐로 k수 만큼의 점수를 받아옴 top k의 점수를 저장
        PriorityQueue<Integer> que = new PriorityQueue<>();
        // score의 길이까지 반복
        for (int i = 0; i < score.length; i++) {
            // que에 score를 반복해서 넣어줌
            que.offer(score[i]);
            // que의 크기가 k보다 커지면 
            if (que.size() > k) {
                // k와 크기를 같게 하기 위해서 que에서 요소를 하나 제거
                // 우선순위큐 이기에 항상 맨앞에 가장 작은 값이 들어있다
                que.poll();
            }
            // 우선순위큐의 peek()은 맨앞의 요소를 확인한다. 가장작은 요소이므로 그래도 answer배열에 차례로 대입
            answer[i] = que.peek();
        }
        return answer;
    }
}