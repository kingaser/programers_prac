class Solution {
    public String solution(String s, int n) {
        String answer = "";
        // 문자열을 하나씩 받아옴
        for (char x : s.toCharArray()) {
            // x가 소문자면
            if (Character.isLowerCase(x)){
                // x+n 이 아스키코드값으로 'z' 보다 커지면 -26 해서 'a'로 만든후 n값 추가하여 계산
                // 아니면 x+n을 문자로 바꿔서 추가
                answer += x+n > 'z' ? (char) (x+n-26) : (char) (x+n);
            }
            // x 가 대문자면
            else if (Character.isUpperCase(x)) {
                // x+n 이 아스키코드값으로 'Z' 보다 커지면 -26 해서 'A'로 만든후 n값 추가하여 계산 후 정답에 추가
                // 아니면 x+n을 문자로 바꿔서 추가
                answer += x + n > 'Z' ? (char) (x+n-26) : (char) (x+n);
            } else answer += (char) x;
        }
        return answer;
    }
}