import java.util.Scanner;

public class j10_boardPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Physics, Chemistry, and Maths: ");
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int maths = scanner.nextInt();
        double overallAggregate = (physics + chemistry + maths) / 3.0;
        if (physics >= 33 && chemistry >= 33 && maths >= 33 && overallAggregate >= 40) {
            System.out.println("Student passed!");
        } else {
            System.out.println("Student failed.");
            String failedSubjects = "";
            if (physics < 33) {
                if (failedSubjects!=""){
                    failedSubjects+=", ";
                }
                failedSubjects += "Physics";
            }
            if (chemistry < 33) {
                if (failedSubjects!=""){
                    failedSubjects+=", ";
                }
                failedSubjects += "Chemistry";
            }
            if (maths < 33) {
                if (failedSubjects!=""){
                    failedSubjects+=", ";
                }
                failedSubjects += "Maths";
            }
            System.out.println(failedSubjects + " aggregate was less than 33 percent.");
            System.out.println("Overall percentage: " + overallAggregate);
        }
    }
}
