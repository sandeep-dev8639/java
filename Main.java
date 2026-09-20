public class Main 
{
    public static void main(String[] args) 
    {
        BankAccount account1 = new BankAccount("Alice", 1000.0);
        account1.printAccountDetails();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.printAccountDetails();

        BankAccount account2 = new BankAccount("Bob", 1500.0, "Savings");
        account2.printAccountDetails();
        account2.deposit(300.0);
        account2.withdraw(1800.0); // Should show insufficient funds
        account2.printAccountDetails();
    }
}
