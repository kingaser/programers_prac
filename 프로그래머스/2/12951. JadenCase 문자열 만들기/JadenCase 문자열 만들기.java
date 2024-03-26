class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toLowerCase().toCharArray();
        
        if ('a' <= arr[0] && arr[0] <= 'z') {
            arr[0] = Character.toUpperCase(arr[0]);
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        
        for (char x : arr) {
            answer += x;
        }
        return answer;
    }
}