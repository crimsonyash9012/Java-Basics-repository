public class j7_otherLoops {
    public static void main(String[] args) {
        int j=1;
        while (j<=3){
            System.out.println(j);
            ++j;
        }

        System.out.println("do while loop-> ");
        do{
            System.out.println(j);
            ++j;
        }while (j<=50);


        System.out.println("for loop->");
        for(int i=1; i<20; i+=2){
            System.out.println(i);
        }
    }
}
