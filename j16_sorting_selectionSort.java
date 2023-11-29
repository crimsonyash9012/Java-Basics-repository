public class j16_sorting_selectionSort {
    public static void main(String[] args) {
        int [] arr = {12, 9, 5, 23, 18};

        for(int i=0; i< arr.length; i++){
            int index = i;
            for(int j=i; j<arr.length; j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
    }
}
