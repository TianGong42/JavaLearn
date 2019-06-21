package six;

public class SixTwoSix {

    public static void main(String[] args){
        int count = 0;

        int i = 1;
        while(count<=100){
            i++;
            if(isPrime(i) && isPalindrome(i)){
            //  //if(isPalindrome(i)){
                count++;
                System.out.print(i + " ");
                if(count%10 == 0){
                    System.out.println();
                }
            }

        }

    }

    //判断这个数字是否是素数
    public static boolean isPrime(int number){

        boolean ip = true;
        for(int i = 2;i<=number/ 2;i++){
            if(number % i == 0){
                ip = false;
            }

        }

        return ip;
    }

    //判断这个数字是否是回文数
    public static boolean isPalindrome(int number){

        boolean ip = false;
        String s = String.valueOf(number);
        String s1 = "";
        for(int i = s.length() - 1;i>=0;i--){
            s1 = s1 + s.charAt(i) ;
        }
        if(s1.equals(s)){
            ip = true;
        }

        return ip;

    }
}
