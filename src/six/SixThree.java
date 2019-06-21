package six;

import java.util.Scanner;

public class SixThree {

    /*
    获取一个数字的回文数
     */
    public static int reverse(int number){
        String n = String.valueOf(number);
        int a = n.length();
        String b = "";
        for(int i = a - 1; i >= 0;i--){
            b = b + n.charAt(i);
        }

        return Integer.valueOf(b);
    }
    /*
    判断这个数是不是回文数
     */
    public static boolean isPalindrome(int number){

        int reverse = reverse(number);
        if(number == reverse)
            return true;
        else
            return false;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.printf("%d是不是回文数:",number);
        System.out.println(isPalindrome(number));

    }
}
