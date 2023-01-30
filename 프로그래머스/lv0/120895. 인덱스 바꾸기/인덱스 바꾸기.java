class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        char tmp = sb.charAt(num1);
        sb.insert(num1, sb.charAt(num2));
        sb.deleteCharAt(num1+1);
        sb.insert(num2, tmp);
        sb.deleteCharAt(num2+1);
        return sb.toString();
    }
}