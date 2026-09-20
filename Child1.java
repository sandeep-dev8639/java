class Parent
{
	static int a=20;
}
class Child2 extends Parent
{
	static int b=10;
	public static void main(String args[])
	{
		System.out.println("the a value is:"+a);
	}
}
class Child1 extends Child2
{
	public static void main(String args[])
	{
		System.out.println("the a+b value is:"+(a+b));
	}
}
