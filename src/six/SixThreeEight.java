package six;

import java.util.Scanner;

public class SixThreeEight {
        //用于将整数格式化为指定宽度
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字： ");
        int n = input.nextInt();
        System.out.println("输入想要的数字长度： ");
        int n1 = input.nextInt();
        System.out.println(format(n,n1));
    }

    public static String format(int number, int width){
        //第一部，将数字转为字符串
        String s = String.valueOf(number);
        int n = s.length();
        //如果输入字符长度和width长度一致，那么直接返回字符串
        if(n>=width){
            return s;
        }else{
            int a = width - n;
            while(a > 0){
                s = "0" + s;
                a--;
            }
            return s;
        }
    }
}
