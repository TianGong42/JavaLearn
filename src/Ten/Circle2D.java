package Ten;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    //如果给定的点(x,y)在圆内，那么方法contains(double x, double y) 返回true
    public boolean contains(double x, double y){
        boolean ip;
        if(Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)) > this.radius){
            ip = false;
        }else{
            ip = true;
        }
        return ip;
    }
    //如果给定的圆在这个圆内，那么方法contains(Circle2D circle)返回true
    public boolean contains(Circle2D circle){
        boolean ip;
        if(Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x) + (circle.getY() - this.y) *
                (circle.getY() - this.y)) > 0){
            ip = false;
        }else{
            ip = true;
        }
        return ip;
    }

    //如果给定的圆和这个圆重叠，那么方法overlaps(Circle2D circle)返回true
    //判断方法，两个圆的半径之和大于两个圆的中心点的直线距离就判定为两个圆重叠
    public boolean overlaps(Circle2D circle){
        boolean ip;
        if(Math.sqrt((this.x - circle.getX()) * (this.x - circle.getX()) + (this.y - circle.getY()) * (this.y - circle.getY()))
         > (circle.radius + this.radius)){
            ip = false;
        }else{
            ip = true;
        }

        return ip;
    }



}
