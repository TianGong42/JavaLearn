package six;

public class SixEvent {

    //主函数
    public static void main(String[] args){
        System.out.println("摄氏度         华氏度                  华氏度         ");
        System.out.println("---------------------------------------------------");
        for(double a = 40.0;a>30.0;a--){
            System.out.printf("%.1f           %.1f\n",a,celsiusToFahrenheit(a));
        }
    }
    //摄氏度转华氏度
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius +32;
    }
    //华氏度转摄氏度
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
