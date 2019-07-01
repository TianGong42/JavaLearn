package Ten;

import java.math.BigInteger;

public class TenOneSix {
    public static void main(String[] args){

        int count = 1;
        BigInteger i = new BigInteger("1");
        while(count <= 10){
            if( (i.mod(new BigInteger("2")).compareTo(new BigInteger("0"))) == 0
                    || (i.mod(new BigInteger("3")).compareTo(new BigInteger("0"))) == 0){
                System.out.print(i + " ");
                count++;
            }
            i = i.add(new BigInteger("1"));

        }
    }
}
