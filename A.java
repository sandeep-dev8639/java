class Bank 
{ 
    String name; 
    double bal; 
    Bank() 
    { 
    } 
    Bank(String name, int bal) 
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
    Hdfc(String name, int bal, String ifsc) 
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
class A extends Hdfc
{
    A(String name, int bal, String ifsc)
    {
        super(name, bal, ifsc);
    }
    public static void main(String args[])
    {
        A sd = new A("sandeep",5000,"e1");
        sd.display();
    }
}