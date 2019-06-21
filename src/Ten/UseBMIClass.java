package Ten;

public class UseBMIClass {

    public static void main(String[] args){
        //构造函数1，要填年龄的
        BMI bmi1 = new BMI("Kim Yang", 18,145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
        //构造函数2，不用填年龄的
        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
