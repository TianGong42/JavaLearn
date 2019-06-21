package five;

public class FiveOneEight {
    public static void main(String[] args){
        //使用嵌套的循环语句，用四个独立的程序打印下面的图案
        System.out.println("图案1");
        for(int i = 1;i<=6;i++){
            for(int k = 1;k<=i;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }
        System.out.println("图案2");
        for(int i=6;i>=1;i--){
            for(int k = 1;k<=i;k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println("图案3");
        for(int i = 1;i <= 6;i++){
            //每一行分两部分进行，先打印空格，再打印数字
            //空格打印的数量，比行数少1
            for(int k = 6;k - i>0;k--){
                System.out.print("  ");
            }
            for(int k = i;k>=1;k--){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
        System.out.println("图案4");

        for(int i = 1;i<=6;i++){
            //打印内容也是分两部分，先打空格，然后打数字
            for(int k = 1;k<i;k++){
                System.out.print("  ");
            }
            for(int k = 1;k<=6-i+1;k++){
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
