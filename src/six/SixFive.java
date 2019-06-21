package six;

import java.util.Scanner;

public class SixFive {

    public static void displaySortedNumbers(
       double num1,double num2,double num3
    ){
        if(num1 > num2){

        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("输入第一个浮点数: ");
        double n1 = input.nextDouble();
        System.out.println("输入第二个浮点数： ");
        double n2 = input.nextDouble();
        System.out.println("输入第三个浮点数：");
        double n3 = input.nextDouble();
        displaySortedNumbers(n1,n2,n3);


    }
}
