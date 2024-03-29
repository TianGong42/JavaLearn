package eleven;

/**
 *  通过extends关键字，它就继承了getColor、setColor、isFilled、setFilled和toString
 * */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{

    private double radius;

    public CircleFromSimpleGeometricObject(){

    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }
    //重载构造方法
    public CircleFromSimpleGeometricObject(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void printCircle(){
        System.out.println("The circle is create " +
                getDateCreated() + " and the radius is " + radius);
    }
    @Override
    public String toString(){
        return super.toString() + "\nradius is " + radius;
    }


}
