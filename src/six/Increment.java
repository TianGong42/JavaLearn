package six;

public class Increment {
    /**
     * 当调用带参数的方法时，实参的值传递给形式参，这个过程称为按值传递。
     *如果实参是变量而不是直接量，则讲该变量的值传递给形参。无论形参在方法中是否改变
     * 该变量都不受影响
     * @param args
     */
    public static void main(String[] args){
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}
