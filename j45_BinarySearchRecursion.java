public class j45_BinarySearchRecursion {
    public int binarySearch(int l, int r, int key, int[] arr){
        if(r>=l && l<=arr.length-1){
            int mid = l+  (r-l)/2;
//            System.out.println(l + " " + r);
//            System.out.println(mid);
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid]>key) {
                return binarySearch(l, mid-1,key, arr);
            }
            return binarySearch(mid+1, r,key, arr);
        }

        return 0;

    }

    public static void main(String[] args) {
        j45_BinarySearchRecursion j1 = new j45_BinarySearchRecursion();
        int []arr = {0,1,2,3,4,5};
        System.out.println(j1.binarySearch(0, arr.length-1, 4, arr));
    }
}
