public class j80_MergeSort_InversionCount {
    public static void main(String[] args) {

        int[] arr = {2,4,1,3,5};
        int n = arr.length;

        int i=0,j=i+1;

        while(i<=n-2){
//            j=i+1;
            if(arr[i]<=arr[j]){
//                i++;
                j++;
//                continue;
            }
            else{
                if(j<n){
                    System.out.printf("(%d, %d), ", arr[i], arr[j]);
//                    i++;
                    j++;
                }
            }

        }

    }
    
}
