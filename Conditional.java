import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First number: ");
            Double num1 = scanner.nextDouble();
            System.out.print("Enter Second number: ");
            Double num2 = scanner.nextDouble();

            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2); 
        }
    }
}
