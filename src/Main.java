import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean done = false;

        // Repeat until the division works
        do {
            try {
                System.out.print("First number: ");
                int a = sc.nextInt();
                System.out.print("Second number: ");
                int b = sc.nextInt();
                System.out.println(a + " / " + b + " = " + CalculatorUtils.divide(a, b));
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Please type whole numbers only.");
                sc.nextLine();   // remove the wrong text from the Scanner
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            } finally {
                System.out.println("Operation finished.");
            }
        } while (!done);

        // Extra: a setter that throws an exception
        System.out.println();
        Student ana = new Student("Ana");
        try {
            ana.setGrade(15);
            System.out.println("Grade saved: " + ana.getGrade());
            ana.setGrade(25);
            System.out.println("This line is not printed");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
