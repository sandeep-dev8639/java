import java.util.Scanner;

class AllDataTypes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Clear the newline left by nextBoolean()
        sc.nextLine();

        System.out.print("Enter a char value: ");
        char c = sc.nextLine().charAt(0);

        System.out.print("Enter a string value: ");
        String str = sc.nextLine();

        System.out.println("\n===== OUTPUT =====");

        System.out.println("Byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("Integer = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Boolean = " + bool);
        System.out.println("Char = " + c);
        System.out.println("String = " + str);

        sc.close();
    }
}
