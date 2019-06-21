package Seven;

import java.util.Scanner;

public class FindNearestPoints {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        //得到获取点的pi，因为是平面坐标，是一个列数是2
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for(int i = 0;i < points.length;i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        //这里p1和p2，应该是计算的两个点
        int p1 = 0, p2 = 1;

        double shortestDistance = distance(points[p1][0], points[p1][1],points[p2][0],points[p2][1]);
        //这个代码的实现方式和我想象的一样，就是遍历所有两点坐标。如果存在距离短的，就更新两个点坐标。
        for(int i = 0;i < points.length;i++){
            for(int j = i + 1; j < points.length;j++){
                double distance = distance(points[i][0],points[i][1],points[j][0], points[j][1]);

                if(shortestDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " + "(" + points[p1][0] + ", "
        +points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
    }

    public static double distance(
            double x1, double y1, double x2, double y2
    ){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
    }
}
