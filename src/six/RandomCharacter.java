package six;

public class RandomCharacter {

    /*
        随机生成字符在ch1和ch2之间的字符
     */
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    /*
        随机获取小写字母
     */
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    //随机获取一个大写字母
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }
    //获取一个数字
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }

    //生成一个ascii码
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }



}
