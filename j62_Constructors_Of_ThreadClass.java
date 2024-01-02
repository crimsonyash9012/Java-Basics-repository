class myThr extends Thread{
    public myThr(String name){
        super(name);
    }

    public void run() {
        System.out.println("Hello");
    }
       /* for(int i=0; i<10000; i++){
            System.out.println("I am a thread  1111111111111");
        }*/

}

class myThr1 extends Thread{
    myThr1(Runnable r){
        super(r);
    }

    public void run(){
        for(int i=0; i<10000; i++){
            System.out.println("I am a thread  2222222222222");
        }
    }
}


public class j62_Constructors_Of_ThreadClass {
    public static void main(String[] args) {
        myThr mth = new myThr("Yash");
        myThr mth1 = new myThr("Deva re Deva");
//        myThr1 mth1 = new myThr1();
        System.out.println(mth.threadId());
        System.out.println(mth.getId());
        System.out.println(mth.getState());
        System.out.println(mth.getName());

        System.out.println();

//        System.out.println(mth1.threadId());
//        System.out.println(mth1.getId());
//        System.out.println(mth1.getState());
//        System.out.println(mth1.getName());

        mth.start();
        mth1.start();

        System.out.println(mth1.getId());
        System.out.println(mth1.threadId());
        System.out.println(mth1.getState());
//        System.out.println("Helloo I am a completely used and runned thread");
//        System.out.println(mth.getState());

    }
    
}
