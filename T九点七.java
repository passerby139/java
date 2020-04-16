package 小练习;

import java.util.Date;

public class T九点七 {
    public static void main(String[] args) {
        Account number1 = new Account(1122,20000,4.5);
        number1.withdraw(2500);
        number1.deposit(3000);

        System.out.println("用户("+number1.getId()+")\n当前余额为："+number1.getBalance()+
                "\n每月利息为："+number1.getMonthlyInterest()+"\n建户日期为："+number1.getDateCreated());
    }
}

class Account{
    private int id = 0;                       //用户id
    private double balance = 0;               //账户余额
    private double annualInterestate = 0;     //租金利率
    private Date dateCreated;                  //建户日期
    private double MonthlyInterestate;         //月利率
    private double MonthlyInterest;            //当前用户月利息
    //无参构造
    public Account(){
        dateCreated = new Date();
    }
    //带参构造
    public Account(int id,double balance,double annualInterestate){
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestate = annualInterestate/100;
        this.MonthlyInterestate = annualInterestate/100/12;
    }

    //六个访问器
    public int getId(){
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestate() {
        return annualInterestate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    //返回每月利率
    public double getMonthlyInterestate(){
        return MonthlyInterestate;
    }
    //返回每月利息
    public double getMonthlyInterest(){
        this.MonthlyInterest = this.balance*this.MonthlyInterestate;
        return MonthlyInterest;
    }
    //三个定义器
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestate(double annualInterestate) {
        this.annualInterestate = annualInterestate;
    }
    //两个成员方法
    public void withdraw(int money){
        this.balance = this.balance-money;
    }
    public void deposit(int money){
        this.balance = this.balance+money;
    }
}