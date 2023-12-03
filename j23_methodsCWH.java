public class j23_methodsCWH {

    static float yash(int x, int y){
        float z;
        z=(float) (x*x+y*y)/(2*x*y);
        return z;
    }

    float yash2(int x, int y){
        float z;
        z=(float) (x*x+y*y)/(2*x*y);
        return z;
    }

    public static void main(String[] args) {
        int a=12;
        int b=90;
        float c=yash(a,b);
        System.out.println(c);


        int z = 12/7;
        System.out.println(z);

        //if don't use static then make an object and call like this

        j23_methodsCWH obj = new j23_methodsCWH();
        float c1;
        c1=obj.yash2(a,b);
        System.out.println(c1);
    }
    
}
