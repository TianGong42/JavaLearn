package eleven;

import nine.Rectangle;

public class CastingDemo {

    public static void main(String[] args){
        //创建了两个对象，一个圆和矩形
        Object object1 = new CircleFromSimpleGeometricObject(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1,1);
        //程序使用隐式转换将一个Circle对象赋值给object1并且将一个Rectangle对象赋值给object2
        displayObject(object1);
        displayObject(object2);
    }

    /**
     * 这是一个通用程序设计的例子。它可以通过传入Object的任何实例被调用
     * 只有源对象时目标类的实例时才能进行类型转换。在执行转换前，程序使用instanceof运算符来保证源对象是否是
     * 目标类的实例
     * 如果对象时circle的一个实例，则用显示装换将这个对象转换为Circle对象，
     * 并使用getArea和getDiameter方法显示这个圆的面积和直径
     * @param object
     */
    public static void displayObject(Object object){
        if(object instanceof  CircleFromSimpleGeometricObject){
            System.out.println("The circle area is " +
                    ((CircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is " +
                    ((CircleFromSimpleGeometricObject)object).getDiameter());
        }else if(object instanceof RectangleFromSimpleGeometricObject){
            System.out.println("The rectangle area is " +
                    ((RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
