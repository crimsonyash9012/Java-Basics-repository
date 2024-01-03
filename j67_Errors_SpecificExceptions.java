import java.util.Scanner;

public class j67_Errors_SpecificExceptions {
    public static void main(String[] args) {
        int [] marks = {20,19,18};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index for array: ");
        int i = sc.nextInt();
        System.out.println();

        System.out.print("Enter the number you wanna divide it with: ");
        int num = sc.nextInt();

        try{
            System.out.println("The answer is: " + marks[i]/num );
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Following error has occured: " + e);
        }

    }
}
