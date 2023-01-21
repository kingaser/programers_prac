import java.math.BigInteger;

class Solution {
    public BigInteger fac(int a) {
        BigInteger big = new BigInteger("1");
        for(int i = 1; i < a+1; i++) {
            big = big.multiply(new BigInteger(Integer.toString(i)));
        }
        return big;
    }
    public BigInteger solution(int balls, int share) {
        return fac(balls).divide(fac(balls-share).multiply(fac(share)));
    }
}