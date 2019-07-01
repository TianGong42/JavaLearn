package eleven;

public class TestCircleRectangle {
    public static void main(String[] args){
        /**
         * 新建了一个圆形最简单对象，半径为1
         */
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
        //这边调用了这个对象的方法
        System.out.println(".A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The area is " + circle.getDiameter());
        /**
         * 创建了一个矩形对象，宽2高4
         */
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
