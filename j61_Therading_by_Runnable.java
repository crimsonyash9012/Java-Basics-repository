class myThread1 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("11111111111");
        }
    }
}

class myThread2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("22222222222");
        }
    }
}


public class j61_Therading_by_Runnable {

    public static void main(String[] args) {
        myThread1 bullet1 = new myThread1();
        Thread gun1 = new Thread(bullet1);

        myThread2 bullet2 = new myThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
    
}
