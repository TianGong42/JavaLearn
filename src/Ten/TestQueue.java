package Ten;

public class TestQueue {
    public static void main(String[] args){
        Queue q = new Queue();
        for(int i = 1;i<=20;i++){
            q.enqueue(i);
        }
//        for(int i = 0;i<q.getSize();i++){
//            System.out.print(q.getElement()[i] + " ");
//        }
        System.out.println(q.getSize());
        for(int i = 0;i<=20;i++){
            System.out.print(q.dequeue() + " ");
        }
    }
}
