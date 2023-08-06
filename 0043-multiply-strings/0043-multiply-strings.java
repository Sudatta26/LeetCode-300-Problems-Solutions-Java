import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger Num1 = new BigInteger(num1);
        BigInteger Num2 = new BigInteger(num2);
        BigInteger res=Num1.multiply(Num2);
        return String.valueOf(res);
    }
}