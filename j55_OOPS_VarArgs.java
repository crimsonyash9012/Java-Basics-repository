public class j55_OOPS_VarArgs {
    
    static void foo(int ...arr){
        //array is created
        for(int ele: arr){
            System.out.println(ele);
        }
    }
    static void foot(int i, int ...arr){
        //array is created
        System.out.println(i);
        for(int ele: arr){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        foo(1,2,7,3,4,5,6,2,45,5);
        System.out.println("new method: ");
        foot(1);
        System.out.println("new method2: ");
        foo(1,2,3);





    }
    
}
