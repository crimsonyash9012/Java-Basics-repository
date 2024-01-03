import java.util.Scanner;

class CountExceededException extends Exception{
    @Override
    public String toString(){
        return "Max retries are reached!!! Try agian tomorrow.";
    }

}


public class j71_Errors_PracticeSet {
    public static void testDivision(int b){
        if(b==0){
            throw new IllegalArgumentException("HeHe");
        }
        else {
            System.out.println(10/b);
        }

    }

    // Q-5

    public int array_elem(int ... array) {
        Scanner sc2 = new Scanner(System.in);
        int count = 0;

        while(count<=5){
            try{
                if(count==5){
                    throw new CountExceededException();
                }
            }
            catch (CountExceededException e){
                System.out.println(e.toString());
                break;
            }

            count++;

            System.out.print("Enter the index of array element which you wanna access: ");
            int index = sc2.nextInt();

            if(index>=0){
                if (index<array.length){
                    return array[index];
//                    break;
                }
                else{
                    System.out.println("Invalid Index. Try Again!!!");
                }
            }
            else {
                System.out.println("Invalid Index. Try Again!!!");
            }

        }
        return -1;

    }
    public static void main(String[] args) {

        // Q-1

        System.out.println("Here are odd numbers that divide by 3, 5 and 7 are written below written below...");
        for(int i=3;i<22;i++){
            System.out.println(i);
            i++;
        }

        // Q-2

        try{
            System.out.println(5/0);
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }

        System.out.println();

        try{
            testDivision(0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


        // Q-3 & 4

        int [] arr = {12, 25, 27, 78, 89, 99};
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=5; i++){
            System.out.print("Enter the index which value you want: ");
            int index = sc.nextInt();

            try{
                if(i==5){
                    throw new CountExceededException();
                }
            }
            catch (Exception e){
                System.out.println(e.toString());
                break;
            }

            if(0<=index){
                if(index<5){
                    System.out.println(arr[index]);
                    break;
                }
                else {
                    System.out.println("Try Again!!");
                }
            }
            else {
                System.out.println("Try Again!!");
            }
        }

        CWH_PracticeSet_Errors obj = new CWH_PracticeSet_Errors();
        obj.array_elem(arr);
    }
    
}
