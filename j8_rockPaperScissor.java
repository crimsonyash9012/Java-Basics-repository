import java.util.Random;
import java.util.Scanner;

public class j8_rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("INSTRUCTIONS--\n1--Rock\n2--Paper\n3--Scissor");
        System.out.println("Enter the number of times you want to play: ");
        int times = sc.nextInt();


        //int upperbound = 4;


        int point1=0;
        int point2=0;


        for(int i=1;i<=times; i++){

            int int_random = rand.nextInt(1, 4);

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            //emoji

            String emoji = "";
            if(choice==1){
                emoji = "\uD83E\uDEA8";
            } else if (choice==2) {
                emoji = "\uD83D\uDCC3";
            } else if (choice==3) {
                emoji = "✂️";
            }


            String emoji2="";
            if(int_random==1){
                emoji2 = "\uD83E\uDEA8";
            } else if (int_random==2) {
                emoji2 = "\uD83D\uDCC3";
            } else if (int_random==3) {
                emoji2 = "✂️";
            } else {
                emoji2="x06777TP";
            }


            System.out.println(emoji +" "+emoji2);

            if (choice==int_random){
                System.out.println("Its a Tie!!");
            } else if (choice== int_random+1 && int_random!=0) {
                point1+=1;
                System.out.println("You Won 1 point!!");
            } else if (choice==1 && int_random==3) {
                point1+=1;
                System.out.println("You Won 1 point!!");
            } else if (int_random==1+choice) {
                point2+=1;
                System.out.println("You Lost this chance!!");
            } else if (int_random==1 && choice==3){
                point2+=1;
                System.out.println("You Lost this chance!!");
            }  else {
                System.out.println("Please enter a valid choice. You wasted a chance!!!");
            }
        }

        if(point1>point2){
            System.out.println("You are the Winner.\nYour Points: "+point1+"\nCPU Points: "+point2);
        } else if (point1==point2) {
            System.out.println("The Match is a Tie.\nYour Points: "+point1+"\nCPU Points: "+point2);

        } else {
            System.out.println("You are the Loser.\nYour Points: "+point1+"\nCPU Points: "+point2);
        }
    }
    
}
