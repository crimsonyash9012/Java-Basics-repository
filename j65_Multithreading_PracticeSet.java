class myNewThread1 extends Thread{

    public void run(){
        int i=0;
        while (i<1000000){
            System.out.println("Hello!!!");
            i++;
        }
    }
}

class myNewThread2 extends Thread{
    public void run(){
        while (true){
            //Q-2
            System.out.println("Welcome!!!");
        }
    }
}



public class j65_Multithreading_PracticeSet {
    public static void main(String[] args) {

        //Q-1

        myNewThread1 t1 = new myNewThread1();
        myNewThread2 t2 = new myNewThread2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());
        System.out.println(t2.isAlive());
        t2.setDaemon(true);
        t1.start();
        t2.start();
//        t2.suspend();
        System.out.println(t2.isAlive());
        System.out.println(Thread.currentThread().getState());


    }

    
}
