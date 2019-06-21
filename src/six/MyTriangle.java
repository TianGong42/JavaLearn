package six;

import java.util.Scanner;

public class MyTriangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一条边的长度：");
        double s1 = input.nextDouble();
        System.out.println("输入第二条边的长度： ");
        double s2 = input.nextDouble();
        System.out.println("输入第三条边的长度： ");
        double s3 = input.nextDouble();

        if(isValid(s1,s2,s3)){
            System.out.printf("该三角形面积为： %f\n",area(s1,s2,s3));
        }else{
            System.out.println("输入数据不合法，无法形成三角形");
        }
    }
    /*
    判断这个三条边能不能成为一个三角形
     */
    public static boolean isValid(double side1, double side2, double side3){
        boolean iv = true;
        if(side1 + side2 <= side3){
            iv = false;
        }
        if(side1 + side3 <= side2){
            iv = false;
        }
        if(side2 + side3 <= side1){
            iv = false;
        }
        return iv;
    }

    public static double area(
            double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

}
