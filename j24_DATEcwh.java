import java.util.Date;
public class j24_DATEcwh {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date date = new Date(0, 0, 0);
        Date date2 = new Date();
        System.out.println(date);
        System.out.println(date2);
        // System.out.println(date2.getTime());
        // System.out.println(System.currentTimeMillis());
        // System.out.println(date2.compareTo(date2));
        for(int i = 0; i <1000; i++) {
            System.out.println("blahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh   " + i);
        }
        System.out.println(date2);
    }
    
}
