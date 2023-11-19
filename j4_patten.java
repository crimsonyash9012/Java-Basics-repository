public class j4_patten {
    public static void main(String[] args) {
        int space;
        int star;

        for(int row=1; row<=3; row++) {
            space = (5 - (2 * row - 1)) / 2;
            star = 2 * row - 1;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
