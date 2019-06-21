package Seven;

import java.util.Scanner;
/*
编写程序，读取10个整数，然后按照和读入相反的顺序将它们显示出来
 */
public class SevenTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0;i<a.length;i++){
            a[i] = input.nextInt();
        }
        for(int i = a.length-1;i>=0;i--){
            System.out.print(a[i] + " ");
        }

    }
}
