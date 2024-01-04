import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class j72_Errors_Nested_TryCatch {
    public static void main(String[] args) {

        int [] marks = {20,19,18};
        boolean isInBound = false;

        Scanner sc = new Scanner(System.in);
        int i1=1;

        while (!isInBound){
            if(i1==1){
                System.out.print("Enter the index: ");
            }
            else {
                System.out.print("Enter the index again: ");
            }
            int i = sc.nextInt();
            try{
                try{
                    System.out.println(marks[i]);
                    isInBound = true;
                }
                catch (Exception e){
                    System.out.println("Some exception occurred!!");
                }

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Given index is out of bounds!!");
            }
            i1++;
        }

    }
}
