import java.math.BigInteger;
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        BigInteger i=new BigInteger(String.valueOf(str1.length()));
        BigInteger j=new BigInteger(String.valueOf(str2.length()));
        BigInteger k=i.gcd(j);
        return str1.substring(0,k.intValue());
    }
}