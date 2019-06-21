package five;

public class FiveTwoThree {
    public static void main(String[] args){
        final int  n = 50000;

        double a1 = 0;
        double a2 = 0;

        for(int i = 1;i<=n;i++){
            a1 = a1 + 1/(double )(i);
        }
        for(int i = n;i>=1;i--){
            a2 = a2 + 1/(double)(i);
        }
        System.out.printf("a1 = %f ,a2 = %f\n",a1,a2);
        System.out.println(a1-a2);



    }
}
