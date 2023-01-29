import java.util.Arrays;

class Solution {
    public int solution(int[] a) {
        int res = 0;
        Arrays.sort(a);
        int n1=a[0]*a[1];
        int n2=a[a.length-1]*a[a.length-2];
        res = n1 > n2 ? n1 : n2;
        return res;
    }
}