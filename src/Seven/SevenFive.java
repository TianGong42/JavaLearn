package Seven;

import java.util.Scanner;

public class SevenFive {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        while(true){
            int n = input.nextInt();
            if(n < 0){
                break;
            }
            a[n]++;
        }

    }
}
