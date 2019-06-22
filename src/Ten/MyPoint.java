package Ten;

public class MyPoint {
    public double x;
    public double y;

    MyPoint(){
        x  = 0;
        y = 0;
    }
    MyPoint(double  x,double y){
        this.x = x;
        this.y = y;
    }



    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt((this.x - myPoint.getX())* (this.x - myPoint.getX()) + (this.y - myPoint.getY())
        * (this.y - myPoint.getY()));
    }

    public double distance(double x,double y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }


}
