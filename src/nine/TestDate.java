package nine;

public class TestDate {

    public static void main(String[] args){
        java.util.Date data = new java.util.Date();
        System.out.println(data);

        data.setTime(10000);
        System.out.println(data.toString());
        data.setTime((100000));
        System.out.println(data.toString());
        data.setTime((1000000));
        System.out.println(data.toString());
        data.setTime((10000000));
        System.out.println(data.toString());
        data.setTime((100000000));
        System.out.println(data.toString());
        data.setTime((1000000000));
        System.out.println(data.toString());
    }
}
