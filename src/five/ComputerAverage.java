package five;

import java.util.Scanner;

public class ComputerAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0：" );
        double total = 0;
        int count1 = 0; //记录整数
        int count2 = 0; //记录负数

        while(true){
            int number = input.nextInt();
            if(number > 0){
                count1++;
                total = total + number;
            }
            if(number < 0){
                count2++;
                total = total + number;
            }

            if (number == 0){
                break;
            }

        }
        System.out.println("The number of positives is " + count1);
        System.out.println("The number of negatives is " + count2);
        System.out.println(total);
        System.out.println(total/(count1+ count2));

    }
}
