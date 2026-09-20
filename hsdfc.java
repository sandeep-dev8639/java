class Bank 
{ 
    String name; 
    double bal; 
    Bank() 
    { 
    } 
    Bank(String name, double bal) 
    { 
        this.name= name; 
        this.bal=bal; 
    } 
    void display() 
    { 
        System.out.println("Account holder name: "+name); 
        System.out.println("Account holder balance: "+bal); 
    } 
} 
class Hdfc extends Bank 
{ 
    String ifsc; 
    Hdfc() 
    { 
    } 
    Hdfc(String name, double bal, String ifsc) 
    { 
        super(name,bal); 
        this.ifsc=ifsc; 
    } 
    public void display() 
    { 
        super.display(); 
        System.out.println("bank ifsc code: "+ifsc); 
    }
}
class SBI
{
    public static void main(String args[])
    {
        SBI sd = new SBI()
        sd.bank(sandeep,19)
        sd.display()
        sd.hdfc(sandeep,5000,e1)
        
    }
}