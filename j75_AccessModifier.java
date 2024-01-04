class phone{
    phone(){
        System.out.println("I am a phone.");
    }
}
interface myCamera{
    void takeSnap(int x);
    private void settings(){
        System.out.println("Here are the camera settings:\nShutterSound\nKiller Video\nHideo Itami ");

    }

    default void recordVideo(){
        settings();
        System.out.println("Recording The Video!!");
    }
}

class IPhone extends phone implements myCamera{
    IPhone(){
        System.out.println("I am an IPhone. I am made by apple.");
    }

    public void takeSnap(int x){
        System.out.println("Taking the snap in " + x + " seconds!!");
    }
}




public class j75_AccessModifier {
    public static void main(String[] args) {                              
                              
        IPhone phone = new IPhone();                              
        phone phone1 = new IPhone();                              
        phone.takeSnap(2500);                              
        phone.recordVideo();                              
        // phone1.recordVideo(); -> throws an error!!!                              
    } 
}
