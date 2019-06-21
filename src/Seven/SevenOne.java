package Seven;

import java.util.Scanner;

public class SevenOne {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        System.out.printf("Eneter %d scores: ",number);
        int[] a = new int[4];
        int best = 0;
        for(int i = 0;i<a.length;i++){
            a[i] = input.nextInt();
            if(a[i]> best){
                best = a[i];
            }
        }
        for(int i = 0;i<a.length;i++){
            System.out.printf("Student %d score is %d and grade is %s\n",i , a[i],getGrade(best,a[i]));
        }

    }

    //这个函数是来判断这个学生成绩的等级
    public static String getGrade(int max,int n){
        int a = (max - n);
        if(a <= 10){
            return "A";
        }else if(a <= 20){
            return "B";
        }else if(a <= 30){
            return "C";
        }else if(a <= 40){
            return "D";
        }else{
            return "F";
        }
    }

}
