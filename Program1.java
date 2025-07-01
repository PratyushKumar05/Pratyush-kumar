import java.util.Scanner;

class Calculator {
    double a;
    double b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation");
                return Double.NaN;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);

        double result = calc.calculate();
        System.out.println("Result: " + result);

        sc.close();
    }
}



