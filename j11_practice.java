import java.util.Scanner;

public class j11_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tum;
        int bL;
        int pehliPehliBaar;
        int fight;
        int fit;
        int future;
        int career;
        int self;
        int finance;
        int relation;
        int smart;
        int will;
        int disci;
        int groom;

        System.out.println("////////////////////////////////////////////");
        System.out.println("WELCOME TO THE SUCCESS PREDICTOR SOFTWARE");
        System.out.println("Note - Enter all the marks required in percentage form neglecting the % sign(Write the score only)\uD83D\uDE03\uD83D\uDE03");
        System.out.println("You are doing great if your overall percentage is above 80%");
        System.out.println("");
        System.out.println("Do you want to start?(y/n)");
        String choice = sc.next();
        System.out.println("////////////////////////////////////////////");

        if(choice.equals("y")){

            System.out.print("Enter the marks in Humour: ");
            tum = sc.nextInt();

            System.out.print("Enter the marks in Body Language: ");
            bL = sc.nextInt();

            System.out.print("Enter the marks in Communication: ");
            pehliPehliBaar = sc.nextInt();

            System.out.print("Enter the marks in Fighting: ");
            fight = sc.nextInt();

            System.out.print("Enter the marks in Physical Fitness: ");
            fit = sc.nextInt();

            System.out.print("Enter the marks in Predicting the Future: ");
            future = sc.nextInt();

            System.out.print("Enter the marks in Practical(Career) Knowledge: ");
            career = sc.nextInt();

            System.out.print("Enter the marks in the Knowledge of the self: ");
            self = sc.nextInt();

            System.out.print("Enter the marks in Financial Knowledge: ");
            finance = sc.nextInt();

            System.out.print("Enter the marks in Relationships Knowledge: ");
            relation = sc.nextInt();

            System.out.print("Enter the marks in Smartness: ");
            smart = sc.nextInt();

            System.out.print("Enter the marks in the Will Power: ");
            will = sc.nextInt();

            System.out.print("Enter the marks in the Discipline: ");
            disci = sc.nextInt();

            System.out.print("Enter the marks in the Basic Grooming: ");
            groom = sc.nextInt();

            System.out.println("");


            float avg = (tum+bL+pehliPehliBaar+fight+fit+future+career+self+finance+relation+smart+will+disci+groom)/14.0f;

            System.out.printf("Your chances of being Successful are %.3f percent.\nThanks For Using our system.\n", avg);


        }




       /* if(tum>){
            System.out.println("You are passed in the marrige competition");
        }*/
    }
}
