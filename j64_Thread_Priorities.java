class th1 extends Thread{

    th1(String name){
        super(name);
    }

    public void run(){
        while (true){
            System.out.println("I am a thread " + this.getName());
        }
    }
}

public class j64_Thread_Priorities {
    public static void main(String[] args) {
        th1 thread1 = new th1("Yash Kumar Gola (The Boss)");
        th1 thread2 = new th1("Bill Gates");
        th1 thread3 = new th1("Shahrukh Khan");
        th1 thread4 = new th1("Army");
        th1 thread5 = new th1("Pt. Deendayal.com 40404040404404040404040404040404040440044040");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread5.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
    
}
