package five;

import java.util.Scanner;

//根据用户输入年份和代表该年第一天是星期几的数字
public class FiveTwoEight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份： ");
        int year = input.nextInt();
        System.out.println("该年度的1月1号为星期几： ");
        int day = input.nextInt();
        int total = 0;

        //最外层我放一个12个月的循环
        for(int i = 0;i<12;i++){
            //里层我应该放一个swith判断语句

            switch (i){
                case 1 : total = total + 31;break;
                case 2 :
                    if((i % 4 == 0 && i % 100 !=0 )||( i% 400==0)) {
                        total = total + 28;
                    }else{
                        total = total + 29;
                    }
                    break;
                case 3 :total = total + 31;break;
                case 4 :total = total + 30;break;
                case 5 :total = total + 31;break;
                case 6 :total = total + 30;break;
                case 7 :total = total + 31;break;
                case 8 :total = total + 31;break;
                case 9 :total = total + 30;break;
                case 10:total = total + 31;break;
                case 11:total = total + 30;break;
                case 12:total = total + 31;break;

            }
        }
    }
}
