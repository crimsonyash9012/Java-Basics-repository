import java.util.Scanner;

public class j70_Errors_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

            for (int i = 5; i >= 0; i--) {
                try {
                    System.out.println(5 / i);

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                    break;
                }
                finally {
                    System.out.println("My name is Yash Kumar Gola.");
                }
            }

            try{
                System.out.println(50/0);
            }
            finally {
                System.out.println("Code still runs, bcz exception isn't handled implies exception will come but catch isn't required in this format. ");
            }
    }
}
