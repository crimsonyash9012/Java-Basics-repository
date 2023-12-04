public class j25_methodOverloading {

    static void tellJoke(){
        System.out.println("Hello There!! This is Jimmy Vegas, and welcome to my new video!!");
    }

    //in case of numbers, the copy of numbers is passed implies no change in original var...
    static void changeNum(int a){
        a=99;
    }

    //in case of array reference is passed, therefore it refers to object only it's not an object in itself
    //hence if reference is passed implies data will change accordingly
    static void changeRef(int [] arr){
        arr[0] = 100;
    }

    static void foo(){
        System.out.println("Good Morning bro!!");
    }

    //overloaded method here:
    static int foo(int a, int b){
        System.out.println("Good Morning " + a+ " bro!!");
        System.out.println("Good Morning " + b+ " bro!!");
        return 0;
    }

    public static void main(String[] args) {
        
        System.out.println("I am Very happy");    
        int x=53;
        System.out.println("old value is " + x);
        changeNum(x);
        System.out.println("new value is " + x);
        tellJoke();

        //array example

        int [] arr = {23, 90, 99, 100, 56, 87};
        System.out.println("old value is " + arr[0]);
        changeRef(arr);
        System.out.println("new value is " + arr[0]);


        foo();
        foo(100, 30000);
        
    }
    
}
