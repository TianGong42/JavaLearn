package Seven;

import java.util.Scanner;
/*
计算数字的出现次数
 */
public class SevenThree {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] b = new int[101];
        System.out.print("Enter the integers between 1 and 100: ");
        while(true){
            int a = input.nextInt();
            if(a == 0){
                break;
            }
            b[a]++;
        }
        for(int i = 0 ;i<b.length;i++){
            if(b[i]!=0){
                if(b[i] == 1){
                    System.out.printf("%d occurs 1 time\n",i);
                }else{
                    System.out.printf("%d occurs %d times\n",i, b[i]);
                }

            }
        }

    }
}
