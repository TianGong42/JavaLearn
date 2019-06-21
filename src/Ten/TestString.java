package Ten;

/*
String的方法使用
 */
public class TestString {
    public static void main(String[] args){
        System.out.println("Welcome".replace('e','A'));
        System.out.println("Welcome".replaceFirst("e","A"));
        System.out.println("Welcome".replace("e","AB"));
        System.out.println("Welcome".replace("el","AB"));

        String[] tokens = "Java#HTML#Perl".split("#");
        for(int i = 0;i < tokens.length;i++){
            System.out.print(tokens[i] + " ");
        }

        System.out.println("--------------分割线----------------------");
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is pwoerful".matches("Java.*"));
    }
}
