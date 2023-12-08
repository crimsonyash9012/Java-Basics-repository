public class j39_recursion5 {
    public int stairs(int n) {
        if (n < 3) {
            return n;
        } else {
            return stairs(n - 1) + stairs(n - 2);
        }
    }

    public static void main(String[] args) {
        j39_recursion5 j1 = new j39_recursion5();
        System.out.println(j1.stairs(3));
    }

}
