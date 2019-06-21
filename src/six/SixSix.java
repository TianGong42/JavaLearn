package six;

import java.util.Scanner;

public class SixSix {

    //主函数
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入入一个数字： ");
        int n = input.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n){

        //最外层一个for循环,确认打印行数
        for(int i = 1;i <=n;i++){

            for(int a = n-i; a> 0;a--){
                System.out.print("  ");
            }

            for(int b = i;b>0;b--){
                System.out.print(b + " ");
            }


            System.out.println();
        }
    }
}
