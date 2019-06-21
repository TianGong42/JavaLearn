package six;

import java.util.Scanner;

public class SixOneEight {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if (isPassword(password)) {

            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }

    }

    public static boolean isPassword(String s){

        boolean ip = true;
        int count = 0;
        if(s.length()<8){
            ip = false;
        }
        for(int i = 0;i<s.length();i++){
            if(!(s.charAt(i)>'0'&&s.charAt(i)<'9'||
                    s.charAt(i)>'a'&&s.charAt(i)<'z'||
                    s.charAt(i)>'A'&&s.charAt(i)<'Z')){
                ip = false;
            }
        }
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>'0' && s.charAt(i)<'9'){
                count++;
            }
        }
        if(count<2){
            ip = false;
        }
        return ip;
    }
}
