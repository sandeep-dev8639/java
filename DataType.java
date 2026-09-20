import java.util.Scanner;
 class DataType 
{ 
public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 byte b = sc.nextByte(); 
int i = sc.nextInt(); 
float f = sc.nextFloat();
 double d = sc.nextDouble();
 long l = sc.nextLong(); 
boolean bool = sc.nextBoolean(); 
short s = sc.nextShort();
 System.out.println("Byte = " + b);
 System.out.println("Integer = " + i);
 System.out.println("Float = " + f); 
System.out.println("Double = " + d); 
System.out.println("Long = " + l);
 System.out.println("Boolean = " + bool);
 System.out.println("Short = " + s); 
}
}