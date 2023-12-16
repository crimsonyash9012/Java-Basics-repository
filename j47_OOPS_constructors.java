class employee1{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    //constructor and constructor overloading

   public employee1(){
        id = 12;
        name="Yash Kumar Gola";
   }

   public employee1(int i){
        id = i;
   }

   public employee1(int i, String n){
        id = i;
        name = n;
   }

   
}

public class j47_OOPS_constructors {
    
    public static void main(String[] args) {
        employee1 yash = new employee1();

        System.out.println(yash.getId());
        System.out.println(yash.getName());

        employee1 debu = new employee1(1);
        System.out.println(debu.getId());
        System.out.println(debu.getName());

        employee1 ankit = new employee1(1, "karthik rajaraman");
        System.out.println(ankit.getId());
        System.out.println(ankit.getName());


    } 
}
