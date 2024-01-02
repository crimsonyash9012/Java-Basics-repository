import java.util.Objects;

class Employee{
    int salary;
    String name;

    void getName(){
        System.out.println("The name of the employee is " + name);
    }
    void getSalary(){
        System.out.println("The salary of the employee is " + salary);
    }

    void setName(String name){
        //name = "Atharvan";
        System.out.println("The new name of the employee is " + name);
    }
}

class rectangle{
    public static void repeat(int n){
        if(n==0){
            System.out.println();
        } else if (n==1) {
            System.out.println(3);
        }
        else {
            repeat(n-1);
        }
    }
}

class cellphone{
    void ringing() {
        System.out.println("The cell phone is ringing!\n");
    }

    public void calling(){
        System.out.println("The phone is calling!!\n");
    }

}

class square{
    int len;

    public int getArea() {
        //System.out.println("The area of the square is: ");
        return len*len;
    }

    public int getPeri(){
        //System.out.println("The peri of the square is: ");
        return len*4;
    }
}

class rockstar{
    public void hitting(){
        System.out.println("Tommy is hitting!!");
    }
    public void running(){
        System.out.println("Tommy is running!!");
    }
}


class circle{
    int radi;
    public double circum(){
        return 2*22/7.0*radi;
    }

    public double area(){
        return 22/7.0*radi*radi;
    }

}


public class j59_OOPS_Practice_SetCWH {
    static int length(int ...arr){
        return arr.length;
    }

    public static void main(String[] args) {

        //Q-1

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.name = "Yash";
        emp1.salary = 12000;
        emp1.getName();
        emp1.getSalary();
        emp1.setName("Atharvan");
        emp2.name = "Yashvardhan";
        emp2.salary = 12000;
        emp2.getName();
        emp2.getSalary();
        emp2.setName("Saksham");

        //Q-2
        System.out.println();
        System.out.println("\nQUESTION - 2\n");
        cellphone phone = new cellphone();
        int printer = length(112, 23, 44, 88);
        phone.calling();
        phone.ringing();

        //Q-3
        square sc = new square();
        sc.len = 12;
        int area = sc.getArea();
        int peri = sc.getPeri();
        System.out.printf("The area of the square is: %d\n", area);
        System.out.printf("The perimeter of the given square is: %d", peri);

        //Q-4
        rectangle rc = new rectangle();
        rc.repeat(10);

        //Q-5
        rockstar tommy = new rockstar();
        tommy.hitting();
        tommy.running();

        //Q-6

        circle r = new circle();
        r.radi = 12;
        System.out.printf("The circumference of the circle is %.6f ", r.circum());
        System.out.printf("and the area of the circle is %.6f", r.area());





    }   
}
