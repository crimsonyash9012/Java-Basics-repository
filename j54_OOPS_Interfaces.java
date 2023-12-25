interface bicycle{
    int a = 12;
    void applyBrake(int decrement);
    void accelerate(int increment);
}

abstract class blowHorn{
    abstract public void hornK3G();
}

interface Horn{
    void blowHornK3G();
    void blowHornHAHK();
}

class AvonCycles implements bicycle, Horn{
    public void applyBrake(int decrement){
        System.out.println("Applying brake " + decrement + " times.");
    }
    public void accelerate(int increment){
        System.out.println("Accelerating the cycle at a gear of " + increment);
    }
    public void blowHornHAHK(){
        System.out.println("Hum aapke hain kaun Poo Poo Poo Poo.");
    }
    public void blowHornK3G(){
        System.out.println("Kabhi Khushi Kabhi Gham Pee Pee Pee.");
    }


}


public class j54_OOPS_Interfaces {
    public static void main(String[] args) {
        AvonCycles cycle1 = new AvonCycles();

        System.out.println(cycle1.a);
        // cycle1.a = 45; -> throws error because variable introduced under interface can't be changed
        
        cycle1.applyBrake(50000);
        cycle1.accelerate(6);
        cycle1.blowHornHAHK();
        cycle1.blowHornK3G();
    }
    
}
