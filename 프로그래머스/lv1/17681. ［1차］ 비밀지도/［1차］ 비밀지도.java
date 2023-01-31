class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            int[] map1 = bin(n, arr1[i]);
            int[] map2 = bin(n, arr2[i]);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append((map1[j] == 1 || map2[j] == 1 ? "#" : " "));
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
    
    private static int[] bin(int a, int b) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[a-1-i] = b%2;
            b /= 2;
        }
        return arr;
    }
}