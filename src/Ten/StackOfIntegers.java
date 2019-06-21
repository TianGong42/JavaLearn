package Ten;

public class StackOfIntegers {
    private int[] elements;
    private  int size;
    public static final int DEFAULT_CAPACITY = 16;

        //定义这个栈的默认大小为16
    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }
    //这个构造方法是手动定义栈的大小

    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }
    /*
    这个方法表示进栈的一个方法

     */
    public void push(int value){
        //如果当前的size是大于当前队列，就创建一个队列，这个队列大小是当前队列的2倍打。然后从老数组里复制到新数组里
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    //弹出方法
    public int pop(){
        return elements[--size];
    }

    public int peek(){
        return elements[size - 1];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
