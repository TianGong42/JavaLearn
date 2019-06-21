package five;

import java.util.Scanner;

public class FiveOneNine {
    public static void main(String[] args){
        //编写一个嵌套的for循环，打印下面的输出
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字： ");
        int number = input.nextInt();
        //最外层是一个大的for循环，
        for(int i = 1;i<=number;i++){
            //先打印左边的空格
            //number - i
            for(int k = 1;k<= number - i;k++){
                System.out.print("    ");
            }
            //接下来是输出左边的数字
            for(int k = 0;k<i;k++){
                System.out.printf("%4d",(int)(Math.pow(2,k)));
            }

            //接下来数输出右边的数字
           for(int k = i-1;k>0;k--){
//               if(k<0){
//                   break;
//               }
               System.out.printf("%4d",(int)(Math.pow(2,k-1)));
           }


            //最下面是一个换行
            System.out.println();
        }
    }
}
