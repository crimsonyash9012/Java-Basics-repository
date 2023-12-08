public class j40_recursion6 {
    public int hop(int n){
        if(n<3){
            return n;
        } else if (n==3) {
            return 4;
        }
        else {
            return hop(n-1) + hop(n-2) + hop(n-3);
        }
    }

    public static void main(String[] args) {

            //JEE stairs question
            j40_recursion6 j1 = new j40_recursion6();
            System.out.println(j1.hop(4));
        }
        
}
