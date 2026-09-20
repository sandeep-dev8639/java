import java.util.Scanner;
class VowCon
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the letter:");
		char a = sc.next().charAt(0);
		if (a == 'a'||a=='e'|| a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.println("the letter is vowel");
		}
		else
		{
			System.out.println("the letter is consonent");
		}
	}
}