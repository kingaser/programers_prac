import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // arr배열의 요소를 연속적인 같은 숫자는 1개만 저장하는 List생성
        List<Integer> list = new ArrayList<>();
        // List에 arr배열의 첫번째 요소를 바로 저장
        list.add(arr[0]);
        // for문으로 List에 arr의 요소를 연속된 숫자인지 체크하고 1개씩만 저장
        for (int i = 1; i < arr.length; i++) {  // 첫번째 요소는 저장했으니 두번째 요소부터 반복
            if (list.get(list.size()-1) != arr[i]) list.add(arr[i]); // List의 마지막 요소와 x를 비교하여 같은수가 아니면 저장
        }
        return list.stream().mapToInt(Integer::intValue).toArray(); //스트림으로 List를 int[]로 변환 후 return
    }
}