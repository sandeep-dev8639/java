public class BankAccount 
{
    private String accountHolderName;
    private double balance;
    private String accountType;
    public BankAccount(String accountHolderName, double balance) 
    {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = "Checking";
    }
    public BankAccount(String accountHolderName, double balance, String accountType) 
    {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
    
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } 
        else 
        {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
    public void printAccountDetails() 
    {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
        System.out.println("---------------------------");
    }
}
