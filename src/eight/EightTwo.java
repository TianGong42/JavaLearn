package eight;

import java.util.Scanner;

public class EightTwo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] m = new double[4][4];
        //先获取下数据
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                m[i][j] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));


    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                if(i==j){
                    sum = sum + m[i][i];
                }
//                if(j == m.length-1-i ){
//                    sum = sum + m[i][m.length-1-i];
//                }


            }
        }
        return sum;

    }


}
