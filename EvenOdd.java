import java.util.Scanner;
public class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Integer i = Integer.parseInt(sc.nextLine());
        if((i & 1) == 0)
        {
            System.out.println(i +" is even");
        }
        else
        {
            System.out.println(i +" is odd");
        }
    }
}
