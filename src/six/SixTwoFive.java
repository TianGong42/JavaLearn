package six;

import java.util.Scanner;

public class SixTwoFive {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数： ");
        long millis = input.nextLong();

        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis){

        long seconds = millis / 1000;
        long seconds2 = seconds % 60;
        long m = seconds / 60;
        long m1 = m % 60;
        long h = m / 60;
        String s = String.valueOf(h) + " : " + String.valueOf(m1) + " ；" + String.valueOf(seconds2);
        return s;
    }

}
