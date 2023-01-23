class Solution {
    public int[] solution(int[] nlist) {
        int[] res = new int[2];
        int even = 0, odd = 0;
        for (int i = 0; i < nlist.length; i++) {
            if (nlist[i]%2 == 0) even++;
            else odd++;
        }
        res[0] = even;
        res[1] = odd;
        return res;
    }
}