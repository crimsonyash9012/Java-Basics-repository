class employee{
    int id;
    int salary;
    String name;
    public void getDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    void crimson (int a){
        System.out.println("yash is " + a + " times a good boy!!");

    }

    public int getSalary(){
        return salary;
    }
}

public class j46_OOPS_CustomClass {
    public static void main(String[] args) {

        employee yash = new employee();
        employee devesh = new employee();
        yash.id = 01;
        yash.name = "CrimsonYash";
        devesh.id = 10;
        devesh.name = "DibesDrovin";
        yash.getDetails();
        devesh.getDetails();
        yash.crimson(10000);
        devesh.crimson(1000);



    }
}
