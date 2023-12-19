
abstract class Pen1{
    abstract void write();
    abstract void refil();
}

class fountainPen1 extends Pen1{
    void write(){
        System.out.println("Writing...");
    }
    void refil(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing the nib of your pen...");
    }

}

public class j50_OOPS_AbstractClass_PracticeSet {
    public static void main(String[] args) {
        fountainPen1 pen = new fountainPen1();
        // pen.write();
        // pen.refil();
        pen.changeNib();

    }
    
}
