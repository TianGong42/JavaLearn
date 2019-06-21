package six;

public class SixOneSix {

    public static void main(String[] args){

        for(int i = 2000;i<=2020;i++){
            System.out.printf("%d年有%d天\n",i,numberOfDayInAyear(i));
        }

    }
        //返回一年的天数
    public static int numberOfDayInAyear(int year) {

        boolean isPrime = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            isPrime = true;
        }
        if(isPrime){
            return 366;
        }else{
            return 365;
        }
    }
}
