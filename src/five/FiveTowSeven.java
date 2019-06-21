package five;

//显示闰年
public class FiveTowSeven {
    public static void main(String[] args){
        int count = 1; //统计闰年数量
        boolean isLeap = false; //判断是否为闰年

        for(int i = 101;i<=2100;i++){
            if((i % 4 == 0 && i % 100 !=0 )||( i% 400==0)){
                isLeap = true;
                System.out.print(i + " ");
                if(count % 10 == 0){
                    System.out.println();
                }
                count++;
            }
        }
    }
}
