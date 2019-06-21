package Ten;

public class MyInteger {
    int value;

    MyInteger(int value){
        this.value = value;
    }

    //一个返回int值得get方法
    public int getValue(){
        return value;
    }
    /*
    如果值分别为偶数、奇数或素数，那么isEven()、isOdd()和isPrime()方法都会返回true
     */
    //偶数的判断方法
    public boolean isEven(){
        if(value % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    //奇数的判断方法
    public boolean isOdd(){
        if(value % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
    //素数的判断方法
    public boolean isPrime(){
        boolean ip = true;
        for(int i = 2;i<value / 2;i++){
            if(value % 2 == 0){
                ip = false;
            }
        }
        return  ip;
    }


}
