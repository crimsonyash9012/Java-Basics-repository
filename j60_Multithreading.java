class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Cooking!!");
            System.out.println("Daadi ka Khana...");
        }

    }
}

class thread3 extends thread1{
    public void run(){
        while(true){
            System.out.println("Hello I am a dummy thread over here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}

class thread2 extends Thread {
    public void run(){
        while(true){
            System.out.println("I am watching breaking bad!!");
            System.out.println("I am going to Manish Sir!!");
            System.out.println("Vansh Ka Birthday!!");
        }
    }
}



public class j60_Multithreading {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
