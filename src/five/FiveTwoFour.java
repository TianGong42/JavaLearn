package five;

public class FiveTwoFour {
    public static void main(String[] args){
        double total = 0;
        for(int i = 1;i<99;i = i + 2){
            total = i / (double)(i + 2);
        }
        System.out.println(total);
    }
}
