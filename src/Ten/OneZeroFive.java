package Ten;

import java.util.Scanner;

public class OneZeroFive {
    public static void main(String[] args){
        //先输入整数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int number = input.nextInt();
        StackOfIntegers s = new StackOfIntegers();

        //然后再求出它的最小因子
        for(int i = 2;i <= number;){
            if(number % i == 0){
                s.push(i);
                number = number / i;
            }else{
                i++;
            }
        }

        //然后将这些因子压到StackOfIntegers类中，然后弹出
        while(s.getSize() > 0){
            System.out.print(s.pop() + " ");
        }
        System.out.println();

    }
}
