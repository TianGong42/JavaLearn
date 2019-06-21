package six;

/*
判断这个素数是不是梅森素数
 */
public class SixTwoEight {

    public static void main(String[] args){

        System.out.println("P                       2^p-1");
        System.out.println("--------------------------------");
        for(int i = 2;i <= Math.pow(2,31);i++){
            if(isPrime(i)&&isMasonPrime(i)){
                System.out.printf("%d                  %d",i,(Math.pow(2,i)-1));
            }
        }

    }
    //判断这个数字是不是素数
    public static boolean isPrime(int n){

        boolean ip = true;
        for(int i = 2;i<=n / 2;i++){
            if(n % i == 0){
                ip = false;
            }
        }
        return ip;
    }
    //判断这个素数是不是梅森素数
    public static boolean isMasonPrime(int number){

        boolean im = false;
        for(int i = 0;i<= 31;i++){
            if(number == (Math.pow(2,i)-1)){
                im = true;
            }
            if((Math.pow(2,i)-1) > number){
                break;
            }
        }
        return im;
    }
}
