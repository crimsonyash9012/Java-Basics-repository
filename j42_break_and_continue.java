public class j42_break_and_continue {
    public static void main(String[] args) {

        int i=0;

        do{
            System.out.println(i);
            i++;
            switch (i){
                case 2 -> System.out.println("You are awesome.");
                case 3 -> System.out.println("Everyday keep smiling.");
                case 4 -> System.out.println("Learn and improve everyday.");
            }
            if(i>=7){
                System.out.println("Hello Everyone");
                continue;
            }
            System.out.println("I am very very happy");
            System.out.println("He is pathetic.");
            System.out.println("\n"+i);

        }while(i<10);




    }
}
