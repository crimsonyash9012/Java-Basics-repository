import java.util.Scanner;

public class j9_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of time till you want the fibonacci:  ");
        byte num=sc.nextByte();

        //System.out.println("The fibonacci series is gives as following: \n");


        int [] fibo;
        fibo = new int[num];
        fibo[0] = 0;
        fibo[1] = 1;
        if(num>=2){
            for(int i=2; i<num; i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            for(int ele: fibo){
                System.out.println(ele);
            }
        }
        else if (num<2) {
            System.out.println(fibo[0]);
        }
        else if (num<=0) {
            System.out.println("Please enter a valid choice!!");

        }
    }
}
