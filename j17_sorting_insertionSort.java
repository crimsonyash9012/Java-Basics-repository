public class j17_sorting_insertionSort {
    public static void main(String[] args) {
        int [] arr1 = {12, 9, 5, 23, 18};
        int len = arr1.length;

        for(int i=0; i<len; i++){
            for(int j=0; j<len-1; j++){
                if(arr1[j]>arr1[j+1]) {
                    int dummy;
                    dummy = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = dummy;
                }
            }
        }

        for(int i=0; i< arr1.length; i++){
            System.out.print(arr1[i] + ", ");
        }

    }
}
