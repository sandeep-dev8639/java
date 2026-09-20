import java.util.Scanner;
class Fibonacci
{
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of terms: ");
		int n = sc.nextInt();
		int a =0, b = 1;
		System.out.println("Fibonacci series: "+a+ " " +b);
		for (int i=2; i<n ; i++)
		{
			int c=a+b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}
	}
}	