package Ten;

import java.util.Scanner;
/*
判断回文串时忽略既非字母又非数字的字符
 */
public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric character, \nis"
        + s + " a palindrome? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String s1 = filter(s);

        String s2 = reverse(s1);
        //然后进行对比，来判断是否是回文。
        return s2.equals(s1);
    }
    /*
    这个方法创建一个空字符串的构建起，将字符串中每一个字母或数字添加到字符串构建器中，然后所得到的字符串
     */
    public static String filter(String s){
        //创建一个String builder
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < s.length();i++){
            //这个方法，可以使用Character类钟的isLetterOrDigit(ch)方法来检查i是否是字母或数字
            if(Character.isLetterOrDigit(s.charAt(i))){
                //如果是，那么久在这个StringBuilder对象后加入对应字符
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
    //根据上述方法得到的字符串，倒置后得到一个新的字符串
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();

        return stringBuilder.toString();

    }
}
