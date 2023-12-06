import java.util.Scanner;

public class j27_methodsPracticeSetCWH {
   static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }

    static void pattern(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println("");

        }
    }
    static void pattern2(){
        for(int i=4; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println("");

        }
    }


    static int sum(int s){
        if(s==1){
            return 1;
       }
        else {
            return s+sum(s-1);
        }
    }

    static int fibo(int i){
        if(i==1||i==2){
            return i-1;
        }
        else {
            return fibo(i-1)+fibo(i-2);
        }
    }

    static float avg(int ...val){
        int sum = 0;
        for(int ele: val){
            sum+=ele;
        }
        float len = (float) val.length;
        float aVG = sum/len;
        return (float) (sum/len);
    }

    static void repeat(int n){
        if(n>0){
            repeat(n-1);
            for(int i=0; i<n; i++){
                System.out.print(4);
            }
        }
        System.out.println();
    }

    static float convert(int temp){
        float tempF = temp*9/5.0f+32;
        return tempF;
    }

    static void repeat3(){
        int i=1;
        while(i<=100){
            for(int j=0; j<i; j++){
                System.out.print(3);
            }
            System.out.println();
            i++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q-1
        System.out.print("Enter the number of which table you want: ");
        int num = sc.nextInt();
        table(num);

        //Q-2
        pattern();

        //Q-3

        System.out.print("Enter the number till which you want the sum -> ");
        int input = sc.nextInt();
        System.out.println("The sum is: " + sum(input));


        //Q-4
        pattern2();

        //Q-5

        System.out.println("The fibonacci at your number is -> "+fibo(num));

        //Q-6

        System.out.println("The average is -> " + avg(26,12,100,90,40));

        //Q-7 && 8
        repeat(10);

        //Q-9

        System.out.print("Enter the temp in the degree celcius: ");
        int temp = sc.nextInt();
        System.out.println(convert(temp));

        //Q-10
        repeat3();


    }
    
}
