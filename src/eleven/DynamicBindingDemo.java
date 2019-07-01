package eleven;

public class DynamicBindingDemo {

    public static void main(String[] args){
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    /**
     * 这个方法采用Object类型的参数，可以用任何对象作为参数来调用m方法
     * 当执行方法m(Obejct x)时，调用参数x的toString方法。x可能会是Student、Person
     * 或者Object的实例。这些类都有它们自己对toString方法的实现。使用哪个实现取决于运行时x的实例类型
     */
    public static void m(Object x){
        System.out.println(x.toString());
    }

}


class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}

class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}

class GraduateStudent extends Student{

}