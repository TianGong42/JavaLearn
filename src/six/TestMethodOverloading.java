package six;

public class TestMethodOverloading {

    public static void main(String[] args){
        System.out.println("The maximum of 3 and 4 is "
        + max(3,4));

        System.out.println("THe maximum of 3.0 and 5.4 is "
        + max(3,5.4));

        System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
        + max(3.0, 5.4, 10.14));
    }

    //  返回两个整数的最大值
    public static int max(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    /**
     * 返回两个浮点数中最大的数
     * @param num1
     * @param num2
     * @return
     */
    public static double max(double num1, double num2){
        if(num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }

    /**
     * 返回三个浮点数中最大的值
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static double max(double num1, double num2, double num3){
        return max(max(num1, num2), num3);
    }
}
