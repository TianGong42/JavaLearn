package six;

import java.util.Scanner;

public class SixOneThree {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字: ");
        int i = input.nextInt();
        System.out.println("i                    m(i)");
        System.out.println("------------------------------");
        for(int k = 1;k<=i;k++){
            System.out.printf("%d                    %f\n",k ,getSeries(k));
        }
    }

    //获得级数
    public static double getSeries(int n){
        double series = 0;

        for(int i = 1;i<= n;i++){
            series = i / (i + 1.0)+ series;
        }
        return series;
    }
}
