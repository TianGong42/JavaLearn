package Ten;

public class TestCircle2D {
    public static void main(String[] args){

        //显示
        Circle2D c1 = new Circle2D(2 , 2 ,5.5);
        //输出这个圆的面积和周长
        System.out.printf("这个圆的面积： %f\n" , c1.getArea());
        System.out.printf("这个圆的周长： %f\n" , c1.getPerimeter());

        System.out.println("这个圆是否包含这个点,入参是坐标" + c1.contains(3,3));
        System.out.println("这个圆是否包含这个圆，入参是对象" + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("两个圆是否有交叉： " + c1.overlaps(new Circle2D(3,5,2.5)));
    }
}
