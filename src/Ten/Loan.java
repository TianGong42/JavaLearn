package Ten;

public class Loan {
    private double annualInterestRate;         //java的年利率
    private int numberOfYears;                 //贷款的年数
    private double loanAmount;                 //贷款额
    private java.util.Date loanDate;           //产生贷款的日期

    public Loan(){

    }

    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount ){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    //获取年利率
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //设置年利率
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //获取还款年数
    public int getNumberOfYears(){
        return numberOfYears;
    }
    //设置还款年数
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    //获取贷款总额
    public double getLoanAmount(){
        return loanAmount;
    }
    //设置一个新的贷款总额
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    //找到每个月需要付的
    /*
    月利率的计算方式，等于年利率除以12，再除以100
    月付金额 = 贷款总金额 * 月利率 / (1 - ( 1 / (1+月利率）^(还款年数 * 12）））
     */
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - ( 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    //付款总额
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    //贷款总额
    public java.util.Date getLoanDate(){
        return loanDate;
    }

}
