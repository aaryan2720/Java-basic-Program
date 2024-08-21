import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First number: ");
            Double num1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter Second number: ");
            Double num2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("What operation you want to perform?\n  ");
            String operation = scanner.nextLine();

            switch (operation) {
                case "sum" -> System.out.println("Sum of two numbers is: " + (num1 + num2));
                case "sub" -> System.out.println("Subtraction of two numbers is: " + (num1 - num2));
                case "mul" -> System.out.println("Multiplication of two numbers is: " + (num1 * num2));
                case "div" -> {
                    if (num2 != 0) {
                        System.out.println("Division of two numbers is: " + (num1 / num2));
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                }
                default -> {
                }
            }
        }

    }
}
