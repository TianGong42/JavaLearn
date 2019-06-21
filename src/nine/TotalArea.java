package nine;

public class TotalArea {

    public static void main(String[] args){
        //这里创建了一个数组对象的引用
        CircleWithPrivateDataFields[] circleArray;
        //这里调用了创建数组对象的方法
        circleArray = createCircleArray();

        printCircleArray(circleArray);


    }
    /*
    方法作用，创建一个数组对象。
    通过for循环创建数组对象，并且每个数组对象的入参是个随机半径
    最后返回整个数组
     */
    public static CircleWithPrivateDataFields[] createCircleArray(){
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

        for(int i = 0; i <circleArray.length;i++){
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circleArray;
    }
    /*
    打印所有数组对象的半径和面积
     */
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i < circleArray.length;i++){
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("--------------------------------------------------------------");

        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
    }
    //计算整个数组里对象的面积和
    public static double sum(CircleWithPrivateDataFields[] circleArray){

        double sum = 0;

        for(int i = 0; i < circleArray.length;i++){
            sum += circleArray[i].getArea();
        }
        return sum;
    }

}
