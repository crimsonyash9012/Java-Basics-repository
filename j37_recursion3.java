public class j37_recursion3 {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
    
    public static void main(String[] args) {
        String input = "programs";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverse(input));
    }

    
}
