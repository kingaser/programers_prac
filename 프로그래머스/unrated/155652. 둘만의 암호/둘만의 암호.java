class Solution {
    public String solution(String s, String skip, int index) {
        String alpa = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(alpa);
        StringBuilder answer = new StringBuilder();

        for (char c : skip.toCharArray()) {
            for (int i = 0; i < sb.length(); i++) {
                if (c == sb.charAt(i)) {
                    sb.deleteCharAt(i);
                    break;
                }
            }
        }

        for (char c : s.toCharArray()) {
            for (int i = 0; i < sb.length(); i++) {
                if (c == sb.charAt(i)) {
                    if (i + index >= sb.length()) {
                        answer.append(sb.charAt((i + index) % sb.length()));
                    } else {
                        answer.append(sb.charAt(i + index));
                    }
                    break;
                }
            }
        }
        return answer.toString();
    }
}