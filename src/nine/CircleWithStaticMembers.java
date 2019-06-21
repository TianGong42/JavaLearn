package nine;

public class CircleWithStaticMembers {
    /*
    圆的半径
     */
    double radius;
    //对象圆的数量
    static int numberOfObjects = 0;
    /*
    用半径为1创建一个圆，默认构造函数
     */
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    /*
    创建一个圆，半径为特殊的值
     */
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    /*
    得到半径的数量
     */
    static int getNumberOfObjects(){

        return numberOfObjects;
    }
    //计算面积
    double getArea(){

        return radius * radius * Math.PI;
    }
}
