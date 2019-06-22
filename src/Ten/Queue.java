package Ten;

//创建一个队列，先进先出
public class Queue {
    private int[] element;
    int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue(){
        //this.size = DEFAULT_CAPACITY;
        element = new int[DEFAULT_CAPACITY];
    }

    public Queue(int capacity){
        element = new int[capacity];
    }
    //将v加入到队列中,对于入栈来讲，应该是一样的
    public void enqueue(int v){
        //如果当前的size是大于当前队列，就创建一个队列，这个队列大小是当前队列的2倍打，然后从老数组里复制新数组
        if(size >= element.length){
            int[] temp = new int[element.length * 2];
            //element表示目标数组，src表述要复制的起始位置，desc表示目标数组，length表示要复制的长度
            System.arraycopy(element, 0, temp,0,element.length);
            element = temp;
        }
        element[size++] = v;
       // System.out.println(v);
    }
    /*方法dequeue()，用于从队列中移除元素并返回该元素
    这个方法要实现先进先出，这样的话。就是我第一个进入的元素要第一个删除，个人感觉上十分消耗开销
    第一步：获取a[0]的元素，然后存在临时位置上。
    第二步：将a[0]之后的数组位置都往前移动一位
    */
    public int dequeue(){
        int temp = element[0];
        for(int i = 1;i< element.length;i++){
            element[i-1] = element[i];
        }
        element[element.length-1] = 0;
        return temp;
    }
    //方法empty()，如果队列是空的话，该方法返回true
    public boolean empty(){
        return size == 0;
    }
    //方法getSize()，返回队列的大小
    public int getSize(){
        return size;
    }

    public int[] getElement(){
        return element;
    }
}
