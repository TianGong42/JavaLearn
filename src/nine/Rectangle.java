package nine;

public class Rectangle {

    double width ;
    double height ;

    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double NewWidth, double NewHeight){
        width = NewWidth;
        height = NewHeight;
    }

    public double getArea(){
        return width * height;
    }

    public double getPrimeter(){
        return (width + height) * 2;
    }
}
