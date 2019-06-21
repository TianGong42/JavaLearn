package nine;

public class TestRegularPlygon {

    public static void main(String[] args){
        RegularPolygon one = new RegularPolygon();
        RegularPolygon two = new RegularPolygon(6, 4);
        RegularPolygon three = new RegularPolygon(10, 4,5.6,7.8);
        System.out.println("多边形的周长" + one.getPerimeter() + " 面积 " + one.getArea());
        System.out.println("多边形的周长" + two.getPerimeter() + " 面积 " + two.getArea());
        System.out.println("多边形的周长" + three.getPerimeter() + " 面积 " + three.getArea());
    }
}
