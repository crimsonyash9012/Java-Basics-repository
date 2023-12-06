public class j28_recursion {
    static int factorial(int i){
        if(i==0 || i==1){
            return 1;
        }
        else {
            return i*factorial(i-1);
        }
    }

    public static void main(String[] args) {

        int z=7;
        System.out.println("The factorial is: "+ factorial(z));

    }
    
}
