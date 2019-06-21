package Ten;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args){
        System.out.println("50! is \n" + factorial(50));
    }

    public static BigInteger factorial(long n){
        /*
        BigInteger.ONE是一个定义在BigInteger类钟的常量。BigInteger.ONE和new BigInteger("1")是一样的
         */
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i <= n;i++){
            //multiply方法，返回值是this * i
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
