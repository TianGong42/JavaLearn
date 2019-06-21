package nine;

import javafx.geometry.Point2D;

import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        //创建Point2D类的两个对象，toString()方法返回表述该对象的字符串
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        //p1.distance(p2)返回两个点之间的距离
        System.out.println("The distance between p1 and p2 is "
        + p1.distance(p2));

    }

}
