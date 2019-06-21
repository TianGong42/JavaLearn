package five;

import java.util.Scanner;

public class FindTheHeight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        int score = 0;
        System.out.println("请输入学生总数： ");
        int count = input.nextInt();
        while(count > 0){
            System.out.printf("请输入学生分数： ");
            int s = input.nextInt();
            System.out.printf("请输入学生姓名：");
            String n = input.nextLine();

            if (s > score){
                score = s;
                name = n;
            }
            count--;
        }
        System.out.println("分数高最高学生的姓名：" + name);


    }
}
