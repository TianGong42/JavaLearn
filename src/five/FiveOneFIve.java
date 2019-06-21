package five;

public class FiveOneFIve {
    public static void main(String[] args){

        char c1 = '!';
        char c2 = '~';
        int count = 1;
        for(int i = (int)c1;i<=(int)c2;i++){
            //char n = (char)i;
            System.out.print((char)i);

            if(count % 10 == 0){
                System.out.println();
            }else{
                System.out.print(" ");
            }
            count++;
        }
    }
}
