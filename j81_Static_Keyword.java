class Emp{
    int eid;
    int salary;
    static String ceo; // since ceo is same for all the employees
                       // static means data is class oriented not object oriented => same for all objects


    static {
      ceo = "yash kumar gola";
    }
    public Emp(){
        eid = 1;
        salary = 2000;
    }

    public void getData(){
        System.out.println(eid +  " : " +  salary + " : " +  ceo );
    }
}

public class j81_Static_Keyword {
    int i;
    public static void main(String[] args) {

//        i=10; -> non static variable can't be used in a static function

        Emp radha = new Emp();

        Emp raghu = new Emp();

        raghu.salary = 3000;

        radha.getData();
        raghu.getData();



    }

    
}
