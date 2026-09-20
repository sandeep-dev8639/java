interface BankAccount
{
    void deposit(double amount);
    void withdraw(double amount);
}
class SavingsAccount implements BankAccount
{
    double bal;
    double min = 1000;
    
    SavingsAccount(double initialBal)
    {
        bal = initialBal;
    }
   public void deposit(double amount)
    {
        bal += amount;
        System.out.println("deposited : "+amount);
    }
    public void withdraw(double amount)
    {
        if(bal - amount >= min)
        {
            bal -= amount;
            System.out.println("withdraw : "+amount);
        }
        else
        {
            System.out.println("connect with draw mim bal required");
        }
    }
}
class BankDemo
{
    public static void main(String[] args)
    {
        BankAccount savings = new SavingsAccount(2000);
        savings.deposit(500);
        savings.withdraw(1200);
    }
}


