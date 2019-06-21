package five;

public class KilogramToPound {
    public static void main(String[] args){
        System.out.println("千克               磅");
        for(int i = 1; i< 200;i++){
            System.out.printf("%d",i);
            System.out.printf("%20.1f", i * 2.2);
            System.out.println();
        }
    }
}
