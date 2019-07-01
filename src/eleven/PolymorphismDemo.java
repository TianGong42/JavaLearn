package eleven;
/**
 *
 * 多态意味着父类的变量可以指向子类对象
 */
public class PolymorphismDemo {

    public static void main(String[] args){

        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));

        displayObject(new RectangleFromSimpleGeometricObject(1,1,"black", true));
    }

    /**
     * 这个object对象是父类对象，但是在main函数中传入的参数是子类对象，这样父类对象的变量就指向了子类对象
     * @param object
     */
    public static void displayObject(SimpleGeometricObject object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
