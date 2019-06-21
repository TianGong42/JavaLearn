package six;

public class PrimeNumberMethod {
    public static void main(String[] args){
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumber(50);
    }

    public static void printPrimeNumber(int numberOfPrimes){
        final int NUMBER_OF_PRIMERS_PRE_LINE = 10;

        int count = 0;
        int number = 2;

        while(count < numberOfPrimes){
            //
            if(isPrime(number)){
                count++;
                if(count % NUMBER_OF_PRIMERS_PRE_LINE == 0){
                    System.out.printf("%-5s\n", number);
                }else{
                    System.out.printf("%-5s", number);
            }
            }

            number++;
        }
    }

    /**
     * 校验这个数字是不是素数
     */
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true; // number is prime
    }
}
