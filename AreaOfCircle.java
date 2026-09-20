import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String[] args)
	{
		double a=3.14;
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double area = a*(r*r);
		System.out.println("Area of the Circle="+area);
	}
}