class Solution {
    public int[] solution(int[] n) {
        int[] res = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            res[i] = n[i]*2;
        }
        return res;
    }
}