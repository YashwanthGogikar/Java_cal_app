import java.util.Scanner;



public class calculator {
    public class Greeter {
    // A function that returns a greeting message
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator.");
                sc.close();
                return;
        }

        System.out.println("Result:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        sc.close();
    }
}
