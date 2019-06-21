package six;

/*
求1000以内的双素数
 */
public class SixTwoNine {
    public static void main(String[] args){
        //这个循环来进行1000次循环来判断双素数
        for(int i = 2;i<1000;i++){
            if(isPrime(i)){ //先判断这个数字是否是素数，然后再判断i+2是不是素数
                if(isPrime(i+2)){
                    System.out.printf("(%d, %d)\n",i,i+2);
                }
            }
        }
    }

    //这个方法判断这个函数是否是素数
    public static boolean isPrime(int number){
        boolean ip = true;
        for(int i = 2;i <= number / 2;i++){
            if(number % i == 0){
                ip = false;
            }
        }
        return ip;
    }
    //这个方法是输出双素数
    public static void printPrime(int number){

    }
}
