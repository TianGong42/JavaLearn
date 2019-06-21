package five;

public class FiveOneThree {
    public static void main(String[] args){

        int n = 0;

        while(n*n*n < 12000){
            n++;
        }
        System.out.println(n-1);
    }
}
