package Ten;

public class TestStackOfIntegers {

    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 0;i < 10;i++){
           // System.out.println(stack.getSize());
            stack.push(i);
        }
        //只要栈不为空，就一直弹出栈
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
