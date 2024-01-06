public class j78_QuickSort {
    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;

        // swap less than pivot element
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap with pivot

        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }

    // worst case time complexity = O(n^2) --> when pivot is highest or lowest element

    public static void quickSort(int [] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1,high);

        }
    }



    public static void main(String[] args) {
        int [] arr = {2,3,8,1,24,13,9};
        int n=arr.length;

//        j15_quickSort ob = new j15_quickSort();

        quickSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + ", ");
        }

    }
    
}
