import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform addition
        int sum = num1 + num2;

        // Display result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
