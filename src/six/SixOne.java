package six;

public class SixOne {
    /*
    返回五角数
     */
    public static int getPentagonalNumber(int n){
        return n*(3*n - 1)/2;
    }

    public static void main(String[] args){

        int count = 0;
        for(int i = 1;i<=100;i++){
            count++;
            System.out.printf("%5d",getPentagonalNumber(i));
            if(count % 10 == 0 ){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }
    }
}
