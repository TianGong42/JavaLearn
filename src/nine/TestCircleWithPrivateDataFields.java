package nine;

public class TestCircleWithPrivateDataFields {

    public static void main(String[] args){
        //创建了一个圆的对象
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());
        //重新设置圆的半径
        myCircle.setRadius((myCircle.getRadius() * 1.1));
        System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());
        //输出圆对象的个数
        System.out.println("THe number of objects created is " +
                CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
