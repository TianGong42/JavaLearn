package nine;

/*
这个类是主类，他的唯一目的是测试第二个类。
 */
public class TestSimpleCircle {

    public static void main(String[] args){

        // 创建一个圆，半径为1
        //创建了三个对象
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        //创建一个圆，半径为25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        //创建一个圆，半径为125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());
        //修改圆2，设置半径为100
        circle2.radius = 100;
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
    }
}

class SimpleCircle{
    double radius;

    //一个java类可以有多个构造方法，一个是为空默认的。
    //其他的构造方法可以有不同的入参，当时构造这个对象时，使用不同的参数。
    SimpleCircle(){
        radius = 1;
    }

    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPermeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }




}

