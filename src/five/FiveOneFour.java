package five;

import java.util.Scanner;

public class FiveOneFour {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个整数：");
        int n1 = input.nextInt();
        System.out.println("输入第二个整数: ");
        int n2 = input.nextInt();
        int d = 0;
        if(n1 > n2){
            d = n2;
        }else {
            d = n1;
        }
        while(!(n1%d == 0 & n2%d == 0)){
            d--;
        }
        System.out.println(d);
    }
}
