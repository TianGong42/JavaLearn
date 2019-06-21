package six;

import java.util.Scanner;

public class SixOneSeven {
  /*
  编写一个方法，使用下面的方法显示n*n矩阵
   */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter n: ");
        n = input.nextInt();
        printMatrix(n);



    }

    public static void printMatrix(int n ){
        for(int i = 0;i<n;i++){
            for(int k = 0;k < n;k++){
                System.out.print((int)(Math.random()+0.5)+ " ");
            }
            System.out.println();
        }
    }
}
