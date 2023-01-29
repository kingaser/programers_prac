import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        int j = 0;
        while(true) {
            int cnt = 0;
            for (int i = 2; i <= list.get(j); i++) {
                if (list.get(j)%i == 0) cnt++;
            }
            j++;
            if (cnt == 1) answer++;
            if (j == list.size()) break;
        }

        return answer;
    }
}