public class j32_sumQuestion1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 11, 17, 25, 29};
        int n = arr.length;

        //binary search

        int sum = 40;
        int a=0;
        int b=0;

        for (int i = 0; i < arr.length; i++) {
            int key = sum - arr[i];
            b=arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while (start <= end) {
                int m = start + (end - start) / 2;

                if (arr[m] == key) {
                    a = arr[m];
                    break;
                }
                if (arr[m] < key) {
                    start = m + 1;
                } else {
                    end = m - 1;
                }
            }
            if(a+b==sum){
                break;
            }
        }

        System.out.println(a);
        System.out.println(b);


       
    }
}
