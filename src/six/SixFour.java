package six;

import java.util.Scanner;

public class SixFour {
    /*
    反向显示一个整数
     */
    public static void reverse(int number){

        String n = String.valueOf(number);
        int a = n.length();
        String b = "";
        for(int i = a - 1; i >= 0;i--){
            b = b + n.charAt(i);
        }
        System.out.println("反向数是： " + b);

    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        reverse(number);

    }
}
