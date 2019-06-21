package nine;

public class RegularPolygon {

    private int n = 3;     //多边形的边数
    private double side = 1;      //边的长度
    private  double x = 0;        //多边形中的x坐标
    private double y = 0;         //多边形钟的y坐标
    //默认构造函数
    RegularPolygon(){

    }
    //一个能创建指定边数和边长、中心在0,0 的正多边形的构造方法
    RegularPolygon(int NewN, double NewSide){
        n = NewN;
        side = NewSide;
        x = 0;
        y = 0;
    }

    //一个能创建带指定边数和边长度、中心在x、y的正多边形的构造方法
    RegularPolygon(int NewN, double NewSide, double NewX, double NewY){
        n = NewN;
        side = NewSide;
        x = NewX;
        y = NewY;
    }

    public void setN(int NewN){
        n = NewN;
    }

    public int getN(){
        return n;
    }

    public void setSide(double NewSide){
        side = NewSide;
    }

    public double getSide(){
        return side;
    }

    public void setX(double NewX){
        x = NewX;
    }

    public double getX(){
        return x;
    }

    public void setY(double NewY){
        y = NewY;
    }

    public double getY(){
        return y;
    }
    //计算周长
    public double getPerimeter(){
        return n * side;
    }
    //计算面积
    public double getArea(){
        return (n * side * side) /(4 * Math.tan(Math.PI / n));
    }



}
