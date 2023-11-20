public class j5_pattern2 {
    public static void main(String[] args) {
        int space;
        int star;

        for(int row=1; row<=4; row++){
            star = 2*row;
            space = 8-star;

            for(int st=1; st<=(star)/2; st++){
                System.out.print("*");
            }
            for(int s=0; s<space; s++){
                System.out.print(" ");
            }
            for(int st=1; st<=(star)/2; st++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=3; row>0; row--){
            star = 2*row;
            space = 8-star;

            for(int st=1; st<=(star)/2; st++){
                System.out.print("*");
            }
            for(int s=0; s<space; s++){
                System.out.print(" ");
            }
            for(int st=1; st<=(star)/2; st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
