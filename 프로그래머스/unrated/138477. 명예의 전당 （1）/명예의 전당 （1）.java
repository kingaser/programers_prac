import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            if (que.size() == k) {
                if (que.peek() < score[i]) {
                    que.poll();
                    que.offer(score[i]);
                }
            } else {
                que.offer(score[i]);
            }
            list.add(que.peek());
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}