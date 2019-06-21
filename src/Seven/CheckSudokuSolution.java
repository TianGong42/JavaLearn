package Seven;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args){
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }
    //这个函数来获取这个二维数组
    public static int[][] readASolution(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for(int i = 0; i < 9;i++){
            for(int j = 0; j < 9;j++){
                grid[i][j] = input.nextInt();
            }
        }
        return grid;
    }
    /*

     */
    public static boolean isValid(int i, int j, int[][] grid){

        for(int column = 0; column < 9; column++){
            if(column != j && grid[i][column] == grid[i][j]){
                return false;
            }
        }

        for(int row = 0; row < 9; row++){
            if(row != i && grid[row][j] == grid[i][j]){
                return false;
            }
        }

        for(int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++){
            for(int col = (j / 3) * 3; col < (j / 3) * 3 + 3;col++){
                if(row != i && col != j && grid[row][col] == grid[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
    /*
    这个方法检查每个值是否都是从1到9的数字以及每个网络中值是否都有效，来确定是否放入了正确的值
    1、两重循环，if的前两个判断只是判断数组的值是是否在1~9之内
     */
    public static boolean isValid(int[][] grid){
        for(int i = 0; i < 9;i++){
            for(int j = 0; j < 9;j++){
                if(grid[i][j] < 1 || grid[i][j] > 9|| !isValid(i,j,grid)){
                    return false;
                }
            }
        }
        return true;
    }
}
