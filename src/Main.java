import java.util.*;
class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account()
    {
        id=0;
        balance=0.00;
        annualInterestRate=0.00;
        dateCreated=new Date();
    }
    public Account(int cid,double cbal,double ir)
    {
        id=cid;
        balance=cbal;
        annualInterestRate=ir;
        dateCreated=new Date();
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public double getInterestRate()
    {
        return annualInterestRate;
    }

    public void setId(int cid)
    {
        id=cid;
    }
    public void setBalance(double bal)
    {
        balance=bal;
    }
    public void setInterestRate(double air)
    {
        annualInterestRate=air;
    }
    // this method returns monthly interest rate
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    // this method returns monthly interest
    public double getMonthlyInterest()
    {
        double mir=getMonthlyInterestRate();
        double interest=balance*mir ;
        return interest;
    }
    // this method performs withdraw operation
    public void withdraw(double bal)
    {
        balance=balance-bal;
    }
    // this method performs deposit operation
    public void deposit(double bal)
    {
        balance=balance+bal;
    }

}
//test program class
class LAB_3
{
    public static void main(String args[])
    {
// Test of 1st account object
        Account obj1=new Account(1122,20000,4.5/100);
        obj1.withdraw(2500);
        obj1.deposit(3000);
        System.out.println("Current Balance Only :");
        System.out.println("Balance ::"+obj1.getBalance());
        System.out.println("Monthly interest rate :"+obj1.getMonthlyInterest());
        System.out.println("Date Created :"+obj1.getDateCreated());
        System.out.println();

// Test of 2nd account object
        Account obj2=new Account(1133,30000,6.00/100);
        obj2.withdraw(5500);
        obj2.deposit(3000);
        System.out.println("Current Balance Only :");
        System.out.println("Balance :"+obj1.getBalance());
        System.out.println("Monthly interest rate :"+obj2.getMonthlyInterest());
        System.out.println("Date Created :"+obj2.getDateCreated());
        System.out.println();
    }
}