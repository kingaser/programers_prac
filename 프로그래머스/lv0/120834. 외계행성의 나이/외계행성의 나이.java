class Solution {
    public String solution(int age) {
        // 나이를 문자열로 변환
        String tmp = "" + age;
        // 정답 문자열
        String res = "";
        // 문자열의 길이만큼 반복
        int[] t = new int[tmp.length()];
        for (int i = 0; i < t.length; i++) {
            t[i] = tmp.charAt(i) - 48;
        }
        char[] temp = new char[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            // 문자열을 문자로 뽑은후 아스키코드값의 a값인 97을 더한후 문자로 반환
            temp[i] = (char) (t[i] + 97);
            res += temp[i];
        }
        return res;
    }
}