package five;

public class FiveTwoFive {
    public static void main(String[] args){

        //最外面放一个最大的嵌套循环
        for(int i = 10000;i<=100000;i = i + 10000){
            double pi = 0;
            for(int k = 1 ;k <= i; k++){
                pi = pi + Math.pow(-1, k + 1)/(2*k-1);
            }
            pi = 4 * pi;
            System.out.println(pi);
        }

    }
}
