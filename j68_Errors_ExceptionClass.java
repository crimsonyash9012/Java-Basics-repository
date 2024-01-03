import java.util.Scanner;
class myException extends Exception{
    @Override
    public String toString(){
        return "I am a toString function.";
    }
    @Override
    public String getMessage(){
        return "I am getMessage function";
    }
}

public class j68_Errors_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int a= sc.nextInt();

        if(a<10){
            try {
                throw new ArithmeticException("Arreyy Waahh!!");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
//                e.printStackTrace();
                System.out.println(e.toString());
            }
        }
        else {
            System.out.println("Mera desh mahan!!");
        }
    }
}
