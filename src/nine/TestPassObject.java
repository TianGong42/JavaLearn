package nine;

public class TestPassObject {

    public static void main(String[] args){

        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);

        //打印面积，半径为1、2、3、4、5
        int n = 5;
        printAreas(myCircle, n);
        //主函数的对象和方法里使用的是相同一个对象，调用方法传入的值是引用传值。堆里的对象时同一个对象。
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);

    }

    //打印面积的函数
    public static void printAreas(CircleWithPrivateDataFields c, int times){
        System.out.println("Radius \t\tArea");
        while(times >= 1){
            //这样的话，圆的半径一直在增加，然后打印面积
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
