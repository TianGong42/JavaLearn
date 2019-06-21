package nine;

public class CircleWithPrivateDataFields {
    //圆的半径
    private double radius = 1;

    //对象的创建数量
    private static int numberOfObjects = 0;
    //对象默认构造方法
    public CircleWithPrivateDataFields(){
        numberOfObjects++;
    }
    //创建特别半径的对象
    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        //这里numberOfObjects是私有的，所以它不能修改。这里制止了篡改行为。
        numberOfObjects++;
    }

    //返回半径
    public double getRadius(){
        return radius;
    }
    //
    public void setRadius(double newRadius){
        //如果newRadius的值大于0，那么radius = newRadius,否则radius = 0
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    //返回对象数
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    //返回圆的面积
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
