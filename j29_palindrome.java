public class j29_palindrome {
    public void palli(String input){
        boolean palli1 = false;
        int len = input.length();

        for(int i=0; i<len; i++){
            if(input.charAt(i)==input.charAt(len-1-i)){
                palli1 = true;
            }else{
                palli1 = false;
                break;
            }
        }
        if(palli1){
            System.out.println("The string entered is a palindrome.");
        }else{
            System.out.println("The string entered is not a palindrome.");
        }

    }
    public static void main(String[] args) {

        String name = "madam";
        String name1 = "chup be";
        String spoon = "chammahc";
        

        j29_palindrome brain = new j29_palindrome();
        brain.palli(name);
        brain.palli(name1);
        brain.palli(spoon);
                
        //next question

        // for(int i=1; i<=100; i++){
        //     if(i%3!=0 && i%5!=0){
        //         System.out.println(i);
        //     }
        //     else if(i%3==0 && i%5!=0){
        //         System.out.println("fizz");
        //     }
        //     else if(i%5==0 && i%3!=0){
        //         System.out.println("Buzz");
        //     }
        //     else{
        //         System.out.println("FizzBuzz");
        //     }
        // }


        // next Question

        String dummy="";

        for(int i=name1.length()-1; i>=0; i--){
            dummy+=name1.charAt(i);
        }
        System.out.println(dummy);


                    
    
    }
    
}
