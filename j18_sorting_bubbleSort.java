public class j18_sorting_bubbleSort {
    public static void main(String[] args) {
        int [] arr2 = {12, 9, 5, 23, 18};

        System.out.println();

        int n = arr2.length;
        for (int i = 1; i < n; ++i) {
            int key = arr2[i];
            int j = i - 1;

            while (j >= 0 && arr2[j] > key) {
                arr2[j + 1] = arr2[j];
                j = j - 1;
            }
            arr2[j + 1] = key;
        }
        for(int i=0; i< arr2.length; i++){
            System.out.print(arr2[i] + ", ");
        }
    }
}
