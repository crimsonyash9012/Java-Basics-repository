class myNewThr1 extends Thread{
    public void run(){
        while(true){
            System.out.println("1111111111111111111");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class myNewThr2 extends Thread{
    public void run(){
        while (true){
            System.out.println("2222222222222222222");
        }
    }
}

public class j63_Thread_Methods {
    public static void main(String[] args) {
        myNewThr1 th1 = new myNewThr1();
        myNewThr2 th2 = new myNewThr2();
        th1.start();
        /*try{
            th1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }*/

        th2.start();

    }    
}
