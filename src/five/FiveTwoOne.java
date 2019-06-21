package five;

import java.util.Scanner;

public class FiveTwoOne {
    //这道题有问题
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double amount = 0;
        double  year = 0;
        System.out.print("Loan Amount: ");
        amount = input.nextDouble();
        System.out.print("Number of Years: ");
        year = input.nextInt();
        double MonthlyPayment = 0;

        System.out.println("Interest Rate    Monthly Payment   Total Payment");
        for(double i = 5.0;i<=8;i = i + 0.125){
            System.out.printf("%5.3f%%",i);
            System.out.print("           ");
            //这里输出每个月的支出金额
            MonthlyPayment = amount * i / 100.0 / 12.0;
            System.out.printf("%7.2f",MonthlyPayment);



            System.out.println();
        }
    }
}
