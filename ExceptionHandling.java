public class ExceptionHandling 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            int res = 2/0;
        } 
        catch (ArithmeticException e) 
        {
        	System.out.println("denomenater should not be zero"); 
	} 
    } 
}

