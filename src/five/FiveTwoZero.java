package five;

public class FiveTwoZero {
    public static void main(String[] args){
        //打印2到1000之间、包括2和1000的所有素数，每行像是8个素数。数字之间用一个空格字符隔开

        int number = 2;
        int count = 1;  //统计素数的个数，来进行换行
        //最外层是一个循环语句，来循环从2到1000的数字
        while(number<=1000) {
            boolean isPrimes = true;
            for(int divisor = 2; divisor<= number/2;divisor++) {
                //里层是一个对素数的判断语句
                if(number % divisor == 0){
                    isPrimes = false;
                    break;
                }
            }
            if(isPrimes){
                System.out.printf("%4d",number );

                if(count % 8 == 0){
                    System.out.println();
                }
                count++;
            }

            number++;


        }

    }
}
