import java.util.Scanner;
class Divison1
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);;
		System.out.println("enter the numbers :");
		int a = sc.nextInt();
		if (a%2==0 || a%3==0)
		{
			System.out.println("the number is divisable by  2 & 3");
		}
		else
		{
			System.out.println("the number is not divisable by  2 & 3");
		}
	}
}