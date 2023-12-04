import java.util.Scanner;

public class j26_stringsCWHpracticeSet {
    public static void main(String[] args) {
        //Q-1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String iNput = sc.nextLine();
        String input = iNput.toLowerCase();
        System.out.printf("The lower case string is: %s", input);
        System.out.println(" ");

        //Q-2
        String inpuT = input.replace(' ', '_');
        System.out.format("The string replaced with underscore is \n %s ",inpuT );

        //Q-3
        System.out.println(" ");
        String letter_temp = "Dear N, Thank you very much!!!";
        System.out.println("Enter the name of receiver of the letter(Case Sensitive): ");
        String nAME = sc.nextLine();
        String letter_new_temp = letter_temp.replace("N", nAME );
        System.out.print(letter_new_temp);

        //Q-4
        System.out.println(" ");
        String spaces = "This String contains  Double and      triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
    }
    
}
