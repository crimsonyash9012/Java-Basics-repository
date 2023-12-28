interface parent {
    void meth1();

    void meth2();
}

interface child extends parent {
    void meth3();

    void meth4();
}

class myClass implements child {
    public void meth1() {
        System.out.println("Method 1");
    }

    public void meth2() {
        System.out.println("Method 2");
    }

    public void meth3() {
        System.out.println("Method 3");
    }

    public void meth4() {
        System.out.println("Method 4");
    }
}

public class j57_OOPS_InheritanceInInterfaces {
    public static void main(String[] args) {
        myClass obj = new myClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }

}
