public class j35_recursion1 {
    static int arr[] = { 1, 2, 3, 4, 5 }; 
    static int Sum(int A[], int N) 
    { 
        if (N <= 0) 
            return 0; 
        return (Sum(A, N - 1) + A[N - 1]); 
    } 
    public static void main(String[] args) {
        System.out.println(Sum(arr, arr.length)); 
    }
}
