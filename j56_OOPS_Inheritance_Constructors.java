class base{
    int x;
    base(){
        System.out.println("I am a constructor.");
    }
    base(int a){
        System.out.println("I am a constructor with excellence of " + a + " years.");
    }
}
class derived extends base{
    derived(){
        super(19);
        System.out.println("I am a derived class.");
    }
    derived(int a, int b){
        super(a);
        System.out.println("I am a derived class with excellence of " + b + " years.");
    }
}

class childOfDerived extends derived{
    childOfDerived() {
        System.out.println("I am the Child of Derived.");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am the child of derived with excellence of " + z + " years.");

    }
}



public class j56_OOPS_Inheritance_Constructors {
    public static void main(String[] args) {
        //base base = new base();
        //derived derived = new derived();
        //childOfDerived child = new childOfDerived();
        childOfDerived child = new childOfDerived(12,100,1000);




    }
}
