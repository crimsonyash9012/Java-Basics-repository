import java.util.Scanner;

public class j14_array_CWH_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q-1


        float [] earthquake = {9.0f, 7.1f, 4.556f, 8.01f, 9.67f};
        float sum=0;

        for(float ele: earthquake){
            sum+=ele;
        }
        System.out.print("The sum of all ricter scale earthquake array is ");
        System.out.print(sum);

        //Q-2

        int [] check;
        check = new int[5];
        check[0] = 1;
        check[1] = 2;
        check[2] = 3;
        check[3] = 4;
        check[4] = 5;

        System.out.print("Enter the number you want to check: ");
        int checkUsr = sc.nextInt();




        /*if(checkUsr==check[0]){
            System.out.println("the element is the 1st element of array");
        } else if (checkUsr==check[1]) {
            System.out.println("The element is the 2nd element of array");

        }else if (checkUsr==check[2]) {
            System.out.println("The element is the 3rd element of array");

        }else if (checkUsr==check[3]) {
            System.out.println("The element is the 4th element of array");

        }else {
            System.out.println("The element is the 5th element of array");
        }*/




        boolean isInArray = false;
        for(int ele: check){
            if(ele==checkUsr){
                isInArray=true;
            }
        }
        if(isInArray){
            System.out.println("The number is present in the array");
        }
        else {
            System.out.println("The number is not present in the array");
        }


        //Q-3

        int [] marks;
        marks = new int[5];
        marks[0] = 90;
        marks[1] = 99;
        marks[2] = 89;
        marks[3] = 86;
        marks[4] = 79;

        int sum1 = 0;

        for(int i=0; i< marks.length; i++){
            sum+=marks[i];
        }
        float avg = sum1/5.0f;
        System.out.print("The avg is: " + avg);


        //Q-4

        /*int [][] matrix1;
        matrix1 = new int[2][3];
        matrix1[0][0] = 2;
        matrix1[0][1] = 4;
        matrix1[0][2] = 6;
        matrix1[1][0] = 7;
        matrix1[1][1] = 1;
        matrix1[1][2] = 0;

        int [][] matrix2;
        matrix2 = new int[2][3];
        matrix2[0][0] = 1;
        matrix2[0][1] = 4;
        matrix2[0][2] = 9;
        matrix2[1][0] = 2;
        matrix2[1][1] = 4;
        matrix2[1][2] = 8;*/

        int[][] matrix1 = { {1,2,3},
                            {4,5,6}};
        int[][] matrix2 = { {7,8,9},
                            {10,11,12 }};

        int [][] matrixSum;
        matrixSum = new int[2][3];

        for(int i =0; i<matrixSum.length; i++){
            for (int j=0; j<matrixSum[0].length; j++){
                matrixSum[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        for(int i =0; i<matrixSum.length; i++){
            for (int j=0; j<matrixSum[0].length; j++){
                System.out.print(matrixSum[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

        }


        //Q-5

        int[] marks1 = new int[5];
        marks1[0] = 90;
        marks1[1] = 99;
        marks1[2] = 9;
        marks1[3] = 86;
        marks1[4] = 100;

        /*

         int [] marksReverse = new int[5];

         *//*for(int i = marks1.length-1; i>0; i--){
            int j = 0;
            marksReverse[j]+=marks1[i];
            j++;

        }*/
        /*

        int i=4;
        int j=0;
        while(i>=0 && j<5){
            marksReverse[j]+=marks1[i];
            i--;
            j++;
        }
        for (int ele: marksReverse) {
            System.out.println(ele);
        }*/

        int l = marks1.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i=0; i<n; i++){
            temp=marks1[i];
            marks1[i]=marks1[l-i-1];
            marks1[l-i-1]=temp;
        }
        for(int ele: marks1){
            System.out.print(ele+" ");
        }



        //Q-7+6

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int ele: marks1){
            if(ele>max){
                max=ele;
            }
            if(ele<min){
                min=ele;
            }
        }
        System.out.print("The maximum and minimum value in this array is: "+ max+" and "+min);


        //Q-8



        boolean isSorted = true;
        //int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<marks1.length-1;i++){
            if(marks1[i] > marks1[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
