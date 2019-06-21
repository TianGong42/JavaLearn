package five;

public class ComputerTuition {
    public static void main(String[] args){
        double basic = 10000;
        double a = 0.05;
        double total = 0;

        for(int i = 1; i < 10;i++){

            if(i<=4){
                total = total + basic;
            }
            basic = basic * (1 + 0.05);
        }
        System.out.println("10年后的学费：" + basic);
        System.out.println("四年内的总学费： " + total);

    }
}
