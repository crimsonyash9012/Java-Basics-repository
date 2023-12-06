public class j31_array_rotation {
    public static void main(String[] args) {
        int [] A= {25, 30, 4, 5, 6, 7, 10, 14, 17, 18, 20, 24};

        int l=0;
        int h=A.length-1;
        int key=4;
        int index=-1;
        int save=0;

        while(l<h){
            int mid = h+(l-h)/2;
            if(A[mid]==key){
                save = A[mid];
                index=mid;
            }
            else if (A[mid] >A[l]){
                if(A[mid]<key || key<A[l]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            else{
                if(A[l]<=key || key<A[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }

        System.out.println(save);
        System.out.println(index);


    }
}
