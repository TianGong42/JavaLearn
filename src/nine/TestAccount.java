package nine;

public class TestAccount {

    public static void main(String[] args){
        Account a = new Account(1122,20000);
        a.setAnnualInterestRate(4.5);
        a.withDraw(2500);
        a.deposit(3000);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterestRate());
        System.out.println(a.getDateCreate());
    }
}
