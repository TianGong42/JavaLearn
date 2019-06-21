package six;

public class SixTwoSeven {

    public static void main(String[] args){

        int count = 0;
        for(int i = 2;count<=100;i++){
            if(isPrime(i)&&(!isPalndrome(i))){
                if(isPrime(GetRever(i))){
                    System.out.print(i + " ");
                    count++;
                    if(count % 10 == 0){
                        System.out.println();
                    }
                }
            }
        }

    }
    //第一个函数，先判断这个数字是不是素数
        public static boolean isPrime(int number){

        boolean ip = true;

            for(int i = 2;i<= number / 2; i++){
                if(number % i == 0){
                    ip = false;
                }
            }
            return ip;

        }
    //第二个函数，再判断这个数字是不是回文数
    public static boolean isPalndrome(int number){

        boolean ip = false;

        String s = String.valueOf(number);
        String s1 = "";

        for(int i = 0;i < s.length() ;i++){
            s1 =   s.charAt(i) + s1;
        }
        if(s1.equals(s)){
            ip = true;
        }
        return ip;
    }

    //反转这个数字
    public static int GetRever(int n){

      int ans = 0;
      while(n != 0){
          ans = ans * 10 + (n % 10);
          n = n / 10;
      }
      return ans;

    }
}
