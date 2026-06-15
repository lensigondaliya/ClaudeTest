import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Java Calculator");
        System.out.println("======================");

        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            try {
                double result = switch (op) {
                    case '+' -> calc.add(a, b);
                    case '-' -> calc.subtract(a, b);
                    case '*' -> calc.multiply(a, b);
                    case '/' -> calc.divide(a, b);
                    default -> throw new IllegalArgumentException("Unknown operator: " + op);
                };
                System.out.printf("Result: %.2f %c %.2f = %.2f%n", a, op, b, result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Continue? (y/n): ");
            keepGoing = scanner.next().equalsIgnoreCase("y");
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}