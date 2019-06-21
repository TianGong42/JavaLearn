package five;

public class FiveTwoSix {
    public static void main(String[] args){
        //使用下面的数列可以近似计算e

        //最外层一个大的for循环
        for(int i = 10000;i<=100000;i = i + 10000){
            //在这里计算e的值
            double e = 0;
            for(int k = 1;k<=i;k++){
                //每个e的值是有i个项构成
                double j = 1;
                for(int n = 1;n < k;n++){
                    j = j * 1/n;
                }
                e = e + j;
            }
            System.out.println(e);
        }
    }
}
