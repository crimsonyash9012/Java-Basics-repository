import java.util.Objects;
import java.util.Scanner;

class InvalidInputException extends Exception {
    public String toString() {
        return "Invalid Input!!!";
    }
}

class ExceedLimitException extends Exception {
    public String toString(int limit) {
        return "You have exceeded the limit. Keep both numbers under " + limit;
    }
}

class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        return (float) a / b;
    }
}


public class j77_CWH_ErrorsCalculatorProject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("**** Welcome to the very basic calculator ****\n");
        // System.out.println();
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator: ");
        String oper = sc.next();

        if (Objects.equals(oper, "+") || Objects.equals(oper, "-") || Objects.equals(oper, "*")
                || Objects.equals(oper, "/")) {
            switch (oper) {
                case "+":
                    if (a > 100000 || b > 100000) {
                        try {
                            throw new ExceedLimitException();
                        } catch (ExceedLimitException e) {
                            System.out.println(e.toString(100000));
                            break;
                        }
                    } else {
                        System.out.println(calc.addition(a, b));
                        break;
                    }
                case "-":
                    System.out.println(calc.subtract(a, b));
                    break;

                case "*":
                    if (a > 7000 || b > 7000) {
                        try {
                            throw new ExceedLimitException();
                        } catch (ExceedLimitException e) {
                            System.out.println(e.toString(7000));
                            break;
                        }
                    } else {
                        System.out.println(calc.mult(a, b));
                        break;
                    }

                case "/":
                    System.out.println(calc.divide(a, b));
                    break;
            }

        } else {
            try {
                throw new InvalidInputException();
            } catch (InvalidInputException e) {
                System.out.println(e.toString());
            }
        }

    }
}
