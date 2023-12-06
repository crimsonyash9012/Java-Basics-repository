public class j33_sumQuestion2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 11, 17, 25, 29};
        int n = arr.length;

        
        int l=0;
        int r=n-1;
        int sum1=40;

        while(l<r){
            if(arr[l]+arr[r]==sum1){
                System.out.println(arr[l] + " " + arr[r]);
                break;
            } else if (arr[l] + arr[l]>sum1) {
                r--;
            }
            else{
                l++;
            }
        }
    }
}
