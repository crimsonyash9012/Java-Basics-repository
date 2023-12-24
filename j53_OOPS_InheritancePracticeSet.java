class Circle{
    public int radius;
    Circle(){
        System.out.println("Hello");
    }
    Circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

    /*public double circumference(){
        return Math.PI*this.radius*2;
    }*/
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        this.height=h;
    }
    /*public double CSA(){
        return 2*Math.PI*this.radius*this.h;
    }*/
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

/*class Rectangle1{
    public int len;
    public int breadth;
    Rectangle1(int l, int b){
        len = l;
        breadth = b;
        System.out.println("This is a rectangle.");
    }
    public void area(){
        int area = this.len*this.breadth;
        System.out.println("The area of rectangle is " + area );
    }
}*/

/*class Cuboid extends Rectangle1{
    public int height;
    Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }
    public void CSA(){
        int CSA =  this.len*this.breadth*4;
        System.out.println("The CSA of the cuboid is " + CSA);
    }
    public int volume(){
        return this.len*this.breadth*this.height;
    }
}*/


public class j53_OOPS_InheritancePracticeSet {
    public static void main(String[] args) {
        //Q-1

        Circle c1 = new Circle(12);
        System.out.println(c1.area());
        Cylinder cc = new Cylinder(30, 50);
        System.out.println(cc.volume());
        //System.out.println(c.circumference());
        //System.out.println("The CSA of cylinder is " + cc.CSA() + " and the volume is " + cc.volume() + " cubic metres");

        //Q-2

        /*Rectangle1 r = new Rectangle1(10, 12);
        r.area();

        Cuboid cuboid = new Cuboid(10, 20, 40);
        cuboid.CSA();
        cuboid.area();
        System.out.println("The volume of the cuboid is " + cuboid.volume() + " cubic metres");*/


        //Q-3
        
    }
}
