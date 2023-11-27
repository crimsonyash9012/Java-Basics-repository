public class j13_arrayPrint {
    public static void main(String[] args) {
        String [] marks1 = {"Yash", "Rahul", "Deemed", "Rajarumanak", "Dibevasarai"};
        System.out.println(marks1.length);


        int [] marks;
        marks = new int[3];
        marks[0]=1000;
        marks[1]=29;
        marks[2]=67;

        System.out.println("Print using for each loop:\n");
        for(int ele: marks){
            System.out.println(ele);
        }
        System.out.println("\n");

        System.out.println("Print using for loop:\n");
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("\n");

        System.out.println("Print in reverse order using for loop:\n");
        for(int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        System.out.println("Print using for each loop");

        for(int ele: marks ){
            System.out.println(ele);
        }
    }
}
