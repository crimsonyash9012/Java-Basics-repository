import java.util.Scanner;

public class j30_simpleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age ----> ");
        byte age = sc.nextByte();


        switch (age) {
            case 10 -> System.out.println("You are 10 years old.");
            case 12 -> System.out.println("You are 12 years old.");
            case 18 -> System.out.println("You are 18 years old.");
            case 25 -> System.out.println("You are legally eligible to marry a girl!!");
        }
        if(age>18){
            System.out.println("You are an adult!!");
        }
    }
    
}
