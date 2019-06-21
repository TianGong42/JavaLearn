package nine;

import javax.xml.crypto.Data;

public class Account {

    private int id = 0;
    private double balance = 0;  //余额
    private double annualInterestRate;
    private Data dateCreated;    //开户行日期

    Account(){

    }
    Account(int Newid, double Newbalance){
        id = Newid;
        balance = Newbalance;
    }
    public void setId(int Newid){
        id = Newid;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double NewBalance){
        balance = NewBalance;
    }

    public  double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double NewAIR){
        annualInterestRate = NewAIR;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Data getDateCreate(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public void withDraw(double money){
        balance = balance + money;
    }

    public void deposit(double money){
        balance = balance - money;
    }
}
