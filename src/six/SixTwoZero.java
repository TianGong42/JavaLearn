package six;

import java.util.Scanner;

public class SixTwoZero {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String s = input.nextLine();
        System.out.printf("这段字符串有%d个数字\n",countLetters(s));

    }

    public static int countLetters(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>'0'&&s.charAt(i)<'9'){
                count++;
            }
        }
        return count;
    }
}
