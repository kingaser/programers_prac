class Solution {
    public String solution(String new_id) {
        // 대문자 소문자로 변환 및 문자열이 계속 변경되니 StringBuilder 사용
        StringBuilder sb = new StringBuilder(new_id);
        // 대문자 소문자로 변환
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        // 정규식 사용을 위해 String으로 변환
        new_id = sb.toString();
        // 정규식으로 2단계 조건 클리어
        new_id = new_id.replaceAll("[^-|_.0-9a-z]", "");
        // 3단계 마침표(.)가 2번 이상 연속된 부분 하나의 마침표로 치환 클리어
        for (int i = 0; i < new_id.length(); i++) {
            new_id = new_id.replaceAll("[.]+", ".");
        }
        // 다시 StringBuilder로 변환
        sb = new StringBuilder(new_id);
        // 5단계 문자열이 빈 문자열이면 a 대입 먼저 4단계 앞뒤에 마침표가 있으면 제거 클리어
        sb = remove(sb);
        // 6단계 아이디의 길이가 15가 넘으면 15이상의 문자는 제거 클리어
        sb = sb.length() > 15 ? new StringBuilder(sb.substring(0, 15)) : sb;
        sb = remove(sb);
        // repeat을 사용하기 위해 String으로 변환
        new_id = sb.toString();
        // 아이디 길이가 3보다 작으면
        if (new_id.length() < 3) {
            // 아이디 길이가 1이면
            if (new_id.length() == 1) {
                // 문자열 자체를 3곱함
                new_id = new_id.repeat(3);
            } else {
                // 아이디 길이가 2이면 두번째 문자 추가
                new_id += new_id.charAt(1);
            }
        }
        return new_id;
    }
    public static StringBuilder remove(StringBuilder str) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (sb.length() == 1 && sb.charAt(0) == '.') {
                sb.append('a');
            }
            if (sb.charAt(0) == '.') {
                sb.deleteCharAt(0);
            } else if (sb.charAt(sb.length()-1) == '.') {
                sb.deleteCharAt(sb.length()-1);
            } else break;
        }
        return sb;
    }
}