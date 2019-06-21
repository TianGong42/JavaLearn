package nine;

public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed = SLOW;    //风扇的速度
    private boolean on = false;  //表示风扇是否打开
    private double radius = 5;   //风扇的半径
    private String color = "blue";   //风扇的颜色

    public void setSpeed(int NewSpeed){
        speed = NewSpeed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setOn(boolean NewOn){
        on = NewOn;
    }

    public boolean getOn(){
        return on;
    }

    public void setRadius(double NewRadius){
        radius = NewRadius;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String NewColor){
        color = NewColor;
    }

    Fan(){

    }

    public String toString(){
        if(on==false){
            return "fan is off";
        }else{
            return "fan speed is " + speed + ", fan radius is " + radius + ", fan color is " + color;
        }
    }



}
