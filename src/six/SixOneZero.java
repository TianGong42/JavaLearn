package six;

public class SixOneZero {

    //主方法
    public static void main(String[] args){

        int count = 0;
        for(int i = 2;i<=10000;i++){
            if(isPrime(i))
                count++;
        }
        System.out.println("10000以内素数的个数是： " + count);
    }

    public static boolean isPrime(int number){

        boolean isprime = true;
        for(int divisor = 2;divisor <= number / 2;divisor++){
            if(number % divisor == 0)
                 isprime = false;
        }
        return isprime;
    }
}
