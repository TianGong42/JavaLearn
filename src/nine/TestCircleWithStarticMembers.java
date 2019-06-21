package nine;

public class TestCircleWithStarticMembers {

    public static void main(String[] args){
        //numberOfobject 类的静态变量
        System.out.println("Before creating object");
        System.out.println("The number of Circle objects is "
        + CircleWithStaticMembers.numberOfObjects);

        //创建 c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects ("
        + c1.numberOfObjects + ")");

        //创建 c2 对象，半径为5
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        //创建一个对象后，类的静态变量会+1
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius +
                ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
