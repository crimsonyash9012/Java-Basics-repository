class Phone{
    public void playVideo(){
        System.out.println("The video is playing.");
    }
    public void on(){
        System.out.println("The phone is starting.");
    }

}

class SmartPhone extends Phone{
    public void playMusic(){
        System.out.println("The music is being played.");
    }
    public void on(){
        System.out.println("The smartphone is starting.");
    }
}

public class j51_OOPS_DynamicMD {

    public static void main(String[] args) {
        //SmartPhone smart = new SmartPhone();
        Phone obj = new SmartPhone(); // dynamic method dispatch
        obj.playVideo();
        obj.on();
        // obj.playMusic(); -> not allowed in dynamic method dispatch



    }
    
}
