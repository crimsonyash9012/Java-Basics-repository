import java.util.Scanner;

public class j44_practiceSet {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Q-1

        for(int i=4; i!=0; --i) {
            String ch = "*";
            System.out.println(ch.repeat(i));

        }

        //Q-2
        int u=0;
        int sum=0;
        while(u<3){
            sum = sum+(2*u);
            u++;
        }
        System.out.println("Sum of first 3 even numbers is: "+sum);

        //Q-3
        System.out.println("The Table of number 7 is: ");
        int d=1;
        while(d<=10){
            System.out.println(d*7);
            d++;
        }

        //Q-4
        System.out.println("The Table of number 10 in reversed order is: ");
        int z=10;
        while(z>=1){
            System.out.println(z*10);
            z--;
        }

        //Q-5

        System.out.print("Enter the number(from 0-12) you want the factorial of: ");
        int x= sc.nextInt();
        long mult=1;

        for(int t=x; t>0; t-- ){
            mult=mult*t;
        }
        System.out.println("The factorial of number is: "+mult);

        //Q-6
        int m=1;
        while(m<=10){
            System.out.println(5);
            m++;
        }

        //Q-7
        for(int e=0; e<10; e++){
            System.out.println(1);
        }

        //Q-9
        int sum3=0;
        for(int i=1; i<=10; i++){
            sum3 = sum3+(8*i);
        }
        System.out.print("Sum of all multiplicants of table of 8 is: "+sum3);







    }
}
