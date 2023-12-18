abstract class Parent{
    Parent(){
        System.out.println("I am his parent. Who are you?");
    }
    abstract public void greet();
}

class bachcha1 extends Parent{
    public void greet(){
        System.out.println("Aap kaise hain. Nikal jaiye humare ghar se.");
    }
}
class bachcha2 extends Parent{
    public void greet(){
        System.out.println("Bhabhi ji khana bada testy bana hai.");
    }
}

abstract class bachcha3 extends Parent{
    bachcha3(){
        System.out.println("My name is Devesh.");
    }
}


public class j49_OOPS_AbstractClass {
    public static void main(String[] args) {
        // Parent P = new Parent() -> Throws an error
        bachcha1 mummy = new bachcha1();
        mummy.greet();
        bachcha2 naitik = new bachcha2();
        naitik.greet();
        // bachcha3 debu = new bachcha3(); -> abstract classes can't form objects => error

    }
    
}
