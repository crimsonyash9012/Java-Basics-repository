import java.util.Scanner;

public class j20_factorial {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            
            int result = calculateFactorial(number);

            System.out.println("Factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
    
}
