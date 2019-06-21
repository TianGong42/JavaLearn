package eight;

import java.util.Scanner;

public class EightFour {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] m = new int[8][7];
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++){
                m[i][j] = input.nextInt();
            }
        }
    }

    public static void printWorkTime(int[][] m){
        int[] a = new int[8];
        // 先建立一个数组然后
    }


}
