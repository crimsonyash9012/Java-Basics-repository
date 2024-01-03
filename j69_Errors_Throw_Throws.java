class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative!!";
    }
}

public class j69_Errors_Throw_Throws {
    public static double getArea(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(divide(6,0));
            double ar = getArea(-12);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
