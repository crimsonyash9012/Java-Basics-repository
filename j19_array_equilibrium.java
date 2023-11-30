public class j19_array_equilibrium {
    public static void main(String[] args) {
        int [] arr= {1,3,5,9,2,1,5,1};

        int key=0;

        for(int i=1; i<arr.length-1; i++){
            int j= i-1;
            int sum1=0;
            int sum2=0;
            while(j>=0){
                sum1+=arr[j];
                j--;
            }

            j= i+1;

            while(j<arr.length){
                sum2+=arr[j];
                j++;
            }

            if(sum1==sum2){
                key=i;
                break;
            }
            System.out.println(sum1 + " & " + sum2 + ", ");
//            System.out.println(sum1);
        }

        System.out.println(key);
    }
}
