package six;

import java.util.Scanner;

public class SixTwo {

    public static int sumDigits(long n){

        int sum = 0;
        do{
            sum = (int)(n % 10 + sum);
            n = n / 10;

        }while(n  > 0);

        return sum;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long number = input.nextLong();
        System.out.println(sumDigits(number));


    }
}
