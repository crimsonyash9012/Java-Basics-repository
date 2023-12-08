public class j38_recursion4 {
    public static void printReverse(int number) {
        if (number < 1) {
            return;
        } else {
            System.out.println(number);
            printReverse(number - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Reverse order of numbers from " + n + " to 1:");
        printReverse(n);
    }

    
}
