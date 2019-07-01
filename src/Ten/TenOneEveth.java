package Ten;

import java.math.BigInteger;

public class TenOneEveth {
    public static void main(String[] args){
        //System.out.println(Long.MAX_VALUE);
        String s = String.valueOf(Long.MAX_VALUE);
        System.out.println(s);
        BigInteger a = new BigInteger(s);

        int count = 0;
        while(count < 5){
            boolean ip = true;
            for(BigInteger i = new BigInteger("2");i.compareTo(a.divide(new BigInteger("2")))==-1;
                i = i.add(new BigInteger("1"))){
                if(a.mod(i).compareTo(new BigInteger("0")) == 0){
                    ip = false;
                }

            }
            if(ip == true){
                count++;
                System.out.println(a);
            }
            a = a.add(new BigInteger("1"));
            System.out.println(a);
        }
    }
}
