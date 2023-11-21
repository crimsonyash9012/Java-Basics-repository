import java.util.Scanner;

public class j6_pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        int len=2*n-1;
        String star = "*";
        String spaces = " ";
        for(int i=1; i<=n; i++){
            System.out.print(spaces.repeat(n-i));
            System.out.println(star.repeat(2*i-1));
        }
        for(int i=n-1; i>0; i--){
            System.out.print(spaces.repeat(n-i));
            System.out.println(star.repeat(2*i-1));
        }
    }
}
