package Ten;

public class OneZeroSix {
    public static void main(String[] args){
        StackOfIntegers s = new StackOfIntegers();
        for(int i = 120;i > 1;i--){
            boolean isPrime = true;
            for(int j = 2;j< (i + 1 ) / 2;j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                s.push(i);
            }
        }
        while(s.getSize()>0){
            System.out.print(s.pop() + " ");
        }
        System.out.println();

    }
}
