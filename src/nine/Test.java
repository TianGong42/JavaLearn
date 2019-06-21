package nine;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        java.util.Date date = new java.util.Date();
        //get Unix时间搓
        System.out.println("The elapsed time since Jan 1, 1970 is "
        + date.getTime() + " milliseconds");
        System.out.println(date.toString());   //返回一个代表日期和时间的字符串

        java.util.Random random = new Random(3);

        System.out.print("From random1: ");
        for(int i = 0;i < 10;i++){
            System.out.print(random.nextInt(1000) + " ");
        }



    }
}
