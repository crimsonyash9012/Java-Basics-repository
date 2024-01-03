public class j66_Errors_TryCatch {
    public static void main(String[] args) {
        int a=9;
        int b=0;

        try{
            int c=a/b;
            System.out.println("The result is " + c);
        }
        catch (Exception e){
            System.out.println("Couldn't print the result. Reason: " + e);
        }


    } 
}
