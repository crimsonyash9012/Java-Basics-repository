public class j140_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int rem, rev=0, x2=x;
        while(x>0){
            rem = x%10;
            rev = rev*10 + rem;
            x=x/10; 
        }        
        return(rev ==x2);

    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
