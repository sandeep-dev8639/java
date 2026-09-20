import java.util.*;
public class SumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter java marks");
        int java = sc.nextInt();
        System.out.println("enter python marks");
        int python = sc.nextInt();
        System.out.println("enter c marks");
        int c =sc.nextInt();
        int sum = java+python+c;
        System.out.println("total marks="+sum);
        int avg=(java+python+c)/3;
        System.out.println("Average="+avg);
    }
}
