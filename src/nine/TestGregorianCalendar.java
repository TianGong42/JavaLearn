package nine;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args){
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        System.out.println("当前年月日:" + gc.get(GregorianCalendar.YEAR) + "年" + gc.get(GregorianCalendar.MONTH)
                + "月" + gc.get(GregorianCalendar.DAY_OF_MONTH));

        gc.setTimeInMillis(1234567898765L);
        System.out.println("当前年月日:" + gc.get(GregorianCalendar.YEAR) + "年" + gc.get(GregorianCalendar.MONTH)
                + "月" + gc.get(GregorianCalendar.DAY_OF_MONTH));

    }
}