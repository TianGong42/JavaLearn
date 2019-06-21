package six;

import java.util.Scanner;

public class PrintCalendar {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //请输入年份
        System.out.println("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        //输入月份
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        //计算今年的月份
        printMonth(year, month);
    }

    /**
     *  打印月份
     */
    public static void printMonth(int year, int month){
        printMonthTitle(year, month);

        printMonthBody(year, month);
    }
    /*
      打印月份的标题，像2012年5月
     */
    public static void printMonthTitle(int year, int month){
        System.out.println("         " + getMonthName(month)
        + " " + year);
        System.out.println("-----------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    /*
        得到这个月份的英文名字
     */
    public static String getMonthName(int month){
        String monthName = "";
        switch(month){
            case 1 : monthName = "January"; break;
            case 2 : monthName = "February"; break;
            case 3 : monthName = "March"; break;
            case 4 : monthName = "April"; break;
            case 5 : monthName = "May"; break;
            case 6 : monthName = "June"; break;
            case 7 : monthName = "July"; break;
            case 8 : monthName = "August"; break;
            case 9 : monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }
    /*
    打印月份身体
     */
    public static void printMonthBody(int year, int month){

        int startDay = getStartDay(year, month);

        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i = 0;
        for(i = 0;i < startDay; i++){
            System.out.print("    ");
        }

        for(i = 1; i <= numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0){
                System.out.println();
            }

        }
        System.out.println();
    }
    /*
        得到第一天
     */
    public static int getStartDay(int year, int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;

        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }
    /*
        得到这个月有多少天
     */
    public static int getTotalNumberOfDays(int year, int month){
        int total = 0;

        for(int i = 1800; i< year; i++){
            if(isLeapYear(i))
                total = total + 266;
            else
                total = total + 365;
        }
        for(int i = 1; i < month;i++){
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }
    /*
        得到
     */
    public static int getNumberOfDaysInMonth(int year, int month){

        if(month == 1 || month == 3 || month == 5 || month == 7 ||
        month == 8 || month == 10 || month == 12){
            return 31;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        if(month == 2)
            return isLeapYear(year) ? 29:28;

        return 0;
    }
    /*
        判断今年是不是闰年
     */
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
