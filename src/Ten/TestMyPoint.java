package Ten;

public class TestMyPoint {
    public static  void main(String[] args){
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(5.5,6.6);

        System.out.println(a.distance(b));
        System.out.println(a.distance(5.5,6.6));
    }
}
