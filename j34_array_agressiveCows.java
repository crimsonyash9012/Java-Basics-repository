public class j34_array_agressiveCows {
    public static void main(String[] args) {
        int max=0;
        int min=1;
        int k=4;
        int ans=-1;

        int [] arr = {1, 2, 5, 7, 9, 12, 15, 17, 20};
        int n=arr.length;

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }

//        System.out.println(max);
//        System.out.println(min);

        int start=1;
        int end = max-min;

        while(start<=end){
            int mid=(start+end)/2;
            int count=1;
            int last_pos=arr[0];

            for(int i=0; i<n; i++){
                if(arr[i]-last_pos>=mid){
                    count++;
                    last_pos=arr[i];
                }
                if(count ==k){
                    break;
                }
            }
            if(count==k){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        System.out.println(ans);

        

    }
}
