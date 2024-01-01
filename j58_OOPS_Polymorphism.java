interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

class myCellPhone{
    public void call(){
        System.out.println("We are calling to the Police...");
    }
    public void sms(){
        System.out.println("Sending your current location to the CBI...");
    }
}
class mySmartPhone extends myCellPhone implements MyCamera2{
    public void takeSnap(){
        System.out.println("Taking the snap...");
    }
    public void recordVideo(){
        System.out.println("Recording the video...");
    }

}


public class j58_OOPS_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 camera = new mySmartPhone();
        // camera.call(); -> throws an error, because of dynamic method dispatch and polymorphism...
        camera.takeSnap();
        camera.recordVideo();
    }
    
}
