import java.util.Scanner;
class Palindrom
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String str = sc.nextLine();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev += str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str + "is a palindrom");
		}
		else 
		{
			System.out.println(str + "is a not palindrom");
		}
	}
}
		
