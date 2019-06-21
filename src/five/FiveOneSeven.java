package five;

import java.util.Scanner;

public class FiveOneSeven {
    public static void main(String[] args){
        //输出一个金字塔
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int number = input.nextInt();
        //先设一个循环，然后每次都输出一个换行
        for(int i = 1;i <= number;i++){
            //先输出左侧空格，空格的数量判断，根据第几行进行判断，第一行为n-1
            //设定一个循环，根据number-i来输出空格的数量
            int a = number - i;
            while(a>0){
                System.out.print(" ");
                a--;
            }
            //输出中间数字,这个如何判断呢
            //这个输出了左半边的数字
            for(int k = i;k>0;k--){
                if(k == 1){
                    break;
                }
                System.out.print(k);
            }
            //现在我们要输出又半边的数字
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            //最后输出右边空格
            while(a<=number - i){
                System.out.print(" ");
                a++;
            }
            System.out.println();
        }

    }
}
