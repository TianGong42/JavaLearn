package five;

public class KilogramToPoundTwo {
    public static void  main(String[] args){
        System.out.println("千克          磅          磅           千克");
        int kg = 0;
        int p = 0;
        for(int i = 1; i < 200; i++ ){
            kg = 2 * i - 1;
            p = 15 + i * 5;
            System.out.printf("%10d",kg);
            System.out.printf("%10.1f", kg * 2.2);
            System.out.printf("%10d",p);
            System.out.printf("%10.1f", p * 2.2);
            System.out.println();
        }
    }
}
