import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        
        String val="";
        for(int i =0;i<digits.length;i++){
            val+=digits[i];
        }

        BigInteger num = new BigInteger(val);
        num = num.add(BigInteger.ONE);
       
        val=num.toString();
        // System.out.println(val);

        int[] res = new int[val.length()];
         for(int i=0;i<val.length();i++){
            res[i]=val.charAt(i)-'0';

         }
        return res;

    }
}