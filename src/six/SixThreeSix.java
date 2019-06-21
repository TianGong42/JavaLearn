package six;

import java.util.Scanner;

public class SixThreeSix {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        System.out.printf("The area of the polygon is %.14f\n",area(n,side));

    }

    public static double area(int n, double side){
        double area  = 0;
        double Pi = 3.14;

        area = (n * side*side) / (4 * Math.tan(Pi / n));
        return area;
    }
}
