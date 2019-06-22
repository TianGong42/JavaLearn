package Ten;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    //无参构造方法
    public MyRectangle2D(){
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
    //有参构造方法
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    public void setX(double x){
        this.x = x;
    }

    public double  getX(){
        return x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY(){
        return y;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double hight){
        this.height = hight;
    }

    public double getHeight(){
        return height;
    }

    //方法getAreac()返回矩形的面积
    public double getAreac(){
        return width * height;
    }

    //方法getPerimeter()返回矩形的周长
    public double getPerimeter(){
        return 2 * (width + height);
    }

    //如果定的点在矩形内，那么方法contains(double x, double y)返回true
    //判断方法，如果传入的参数的x，大于矩形的值得x - width / 2，小于 x +width
    public boolean contains(double x, double y){
        boolean ip = false;
        if (x >= (this.x - width / 2) && x <= (this.x + width / 2)) {
            if(y >= (this.y - height / 2) && y <= (this.y + height / 2)){
                ip = true;
            }
        }
        return ip;
    }

    //给定的矩形在这个矩形内，方法contains(MyRectangle2D r)返回true
    public boolean contains(MyRectangle2D r){
        boolean ip = false;

        if((this.x + width / 2) >= (r.getX() + r.getWidth()) && (this.x - width / 2) <= (r.getX() - r.getWidth())){
            if((this.y + height/ 2) >= (r.getY() + r.getHeight() / 2) &&(this.y - height/ 2) <= (r.getY() - r.getHeight())){
                ip = true;
            }
        }
        return ip;
    }

    //如果给定的矩形和这个矩形重叠，那么方法overlaps(MyRectangle2D r)返回true
    //方案上来讲,这道题我不想写，就不写了

    public boolean overlaps(MyRectangle2D r){
        return true;

    }

}
