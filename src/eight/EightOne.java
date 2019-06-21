package eight;

import java.util.Scanner;

public class EightOne {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] m = new double[3][4];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                m[i][j] = input.nextDouble();
            }
        }
        for(int i = 0;i<m.length;i++){
            System.out.println("Sum of the elements of column " + i + " is " + sumColumn(m,i));
        }
    }


    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0;i< m[columnIndex].length;i++){
            sum = sum + m[columnIndex][i];
        }
        return sum;
    }

}
