public class J74_Errors_TestExceptions {
    static int divideByZero(int a, int b)
    {
        int i = a / b;
        return i;
    }

    static int computeDivision(int a, int b){
        int res=0;
        try{
            res = divideByZero(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
//            System.out.println("Error occurred");
        }
        return res;
    }
    public static void main(String[] args) {
        /*int [] arr = new int[3];
        try{
            arr[3] = 1;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The given array index is out of bounds");
        }*/
        try{
            System.out.println(computeDivision(5,0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(computeDivision(5,0));


    }
}
