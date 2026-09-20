class Catches 
{ 
    public static void main(String[] args) 
    { 
        try 
        { 
            int a[] = {1, 2, 3}; 
            int res = a[0]/a[3]; 
            System.out.println(res);
        } 
        catch (ArithmeticException e) 
        { 
            System.out.println("denominator should not be zero"); 
        }   
        catch (ArrayIndexOutOfBoundsException e) 
        { 
            System.out.println("index is exceed " +e); 
        } 
    }    
} 